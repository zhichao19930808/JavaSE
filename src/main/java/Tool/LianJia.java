package Tool;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/9.
 * 抓取链家网东城地区房价的行情
 */
public class LianJia implements Runnable{
    private static int counter;
    private String Url;
    private String area;

    /*
11.将程序设置为多线程
    1.实现 Runnable线程
    2.将bj方法变为run方法
        2.1 将参数设置为域
        2.2 创建构造方法
        2.3 在for循环中创建实例，启动线程
     */
/*
10.抓取北京地区的房价行情
    1.将内层循环扩大一倍，把主方法变为lj方法，参数为String类型的Url，删除常量URL
    2.建立一个主方法，获取北京各个区的地址
    3.使用lj方法抓取北京地区的房价
 */

    public static void main(String[] args) throws IOException {
//1.抓取地址
        String url = "http://bj.lianjia.com/ershoufang/rs/";
//2.关联抓取地址
        Document document = Jsoup.connect(url).cookie("lianjia_uuid", "3a4a801b-dbf8-4c15-b5a5-5599f2e77145").get();
//3.获取北京地区各个区的地址
        Elements elements = document.select("div[data-role=ershoufang]").first().select("a[href^=/ershoufang");
        for (Element element : elements) {
            //抓取地区名称
            String Url ="http://bj.lianjia.com/"+element.attr("href")+"pg";
            String area = element.attr("href").replaceAll("(ershoufang|/)", "");
            System.out.println("*********"+area+Url+"***********");
            Thread thread = new Thread(new LianJia(Url,area));
            thread.start();
        }
    }

    public LianJia(String Url, String area) {
        this.Url = Url;
        this.area = area;
    }

    @Override
    public void run() {
        try {
            Document document = Jsoup.connect(Url).cookie("lianjia_uuid", "3a4a801b-dbf8-4c15-b5a5-5599f2e77145").get();
            int total=Integer.parseInt(document.select("h2[class=total fl]").first().child(0).text());
            int pages = (int) Math.ceil(total/30d);
            for (int i = 0; i < pages; i++) {
                System.out.println("地区："+area+"\tpage:"+(i+1));
                page(i+1,Url,area);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void page(int page,String Url,String area){
//8.将抓取的内容存入到文件中
        try(
                BufferedWriter writer = new BufferedWriter(new FileWriter("LianJia/beiJing"+area,true))
                ) {
//2.关联JSoup工具
//        Document document = Jsoup.connect(Url).get();
  /*2.1
    多次访问导致数据异常，点击链家网给出的图片中的倒置图片发现浏览器已经可以访问。
    检查该网页，点击Notwork，查看下方name列表中的第一行内容的Cookies内容
    将对应的键：lianjia_uuid和值：3a4a801b-dbf8-4c15-b5a5-5599f2e77145写入cookie方法的参数中即可继续访问网页
  */
            Document document = Jsoup.connect(Url +page).cookie("lianjia_uuid","3a4a801b-dbf8-4c15-b5a5-5599f2e77145").get();
//3.获取该网页的"li[class=clear]"标签的内容,即每套房子的全部信息
            Elements elements = document.select("li[class=clear]");
//        System.out.println(elements);
            for (Element element : elements) {
//修改：获取房子的id
                String imageUrl = element.childNode(0).attr("href");
                String id = imageUrl.substring(imageUrl.lastIndexOf("/") + 1, imageUrl.lastIndexOf("."));
//4.利用迭代的方法取出每个li标签中第一个"a[data-el=region]"标签中的文本内容，即小区名称；
                String region = element.select("a[data-el=region]").first().text();//region ['riːdʒən]地区
//5.利用迭代的方法取出每个li标签中第一个"div[class=totalPrice]"标签中的文本内容，即总价
                String totalPrice = element.select("div[class=totalPrice]").first().child(0).text();
//6.利用迭代的方法去除每个li标签中第一个""div[class=houseInfo]"标签中的内容
                Element houseInfoElement = element.select("div[class=houseInfo]").first();
//6.1获取 "div[class=houseInfo]"标签中第三个子节点的内容,即是房屋的详细信息
                String houseInfo = houseInfoElement.childNode(2).toString();//childNodes属性:返回节点的子节点集合
//7.利用迭代的方法取出每个li标签中第一个"div[class=unitPrice]"标签，使用attr方法取得他对应域"data-price"属性的一个值
                String unitPrice = element.select("div[class=unitPrice]").first().attr("data-price");
//                System.out.println("小区：" + region + "\n详情：" + houseInfo + "\t单价:" + unitPrice + "\t总价：" + totalPrice);
                writer.write(id+"#"+region+"#"+houseInfo+"#"+unitPrice+"#"+totalPrice+"\n");
                System.out.println("\t"+"counter"+ ++counter);
            }
//9.原先是抓取一页的信息，现在尝试抓取整个东城地区多页的信息
    /*
     1.先把内层循环扩大一倍，把主方法变为page方法，参数接受 int类型的page
     2.将地址后面+pg 然后拿到方法外，作为一个常量
     3.重新做一个主方法
     4.获取东城地区的页码（总数/30）
     5.使用for循环调用page方法，抓取整个东城地区多页的信息
     */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
