package Tool;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/9.
 * 下载链家网东城地区的房价的行情
 */
public class LianJia {
    public static void main(String[] args) throws IOException {
//1.要下载的地址
        String url = "http://bj.lianjia.com/ershoufang/dongcheng/";
//2.关联JSoup工具
//        Document document = Jsoup.connect(url).get();
 /*2.1
    多次访问导致数据异常，点击链家网给出的图片中的倒置图片发现浏览器已经可以访问。
    检查该网页，点击Notwork，查看下方name列表中的第一行内容的Cookies内容
    将对应的键：lianjia_uuid和值：3a4a801b-dbf8-4c15-b5a5-5599f2e77145写入cookie方法的参数中即可继续访问网页
 */
        Document document = Jsoup.connect(url).cookie("lianjia_uuid","3a4a801b-dbf8-4c15-b5a5-5599f2e77145").get();
//3.获取该网页的"li[class=clear]"标签的内容,即每套房子的全部信息
        Elements elements = document.select("li[class=clear]");
//        System.out.println(elements);
        for (Element element : elements) {
//4.利用迭代的方法取出每个li标签中"a[data-el=region]"标签中第一个元素的文本内容，即小区名称；
            String region = element.select("a[data-el=region]").first().text();//region ['riːdʒən]地区
//5.利用迭代的方法取出每个li标签中"div[class=totalPrice]"标签中第一个元素的文本内容，即总价
            String totalPrice =element.select("div[class=totalPrice]").first().text();
//6.利用迭代的方法去除每个li标签中""div[class=houseInfo]"标签中第一个元素的内容
            Element houseInfoElement = element.select("div[class=houseInfo]").first();
//6.1获取 "div[class=houseInfo]"标签中第三个子节点的内容,即是房屋的详细信息
            String houseInfo = houseInfoElement.childNode(2).toString();//childNodes属性:返回节点的子节点集合
//7.利用迭代的方法取出每个li标签中"div[class=unitPrice]"标签中的第一个元素，使用attr方法取得他对应域"data-price"属性的一个值
            String unitPrice =element.select("div[class=unitPrice]").first().attr("data-price");
            System.out.println("小区："+region+"\n详情："+houseInfo+"\t单价:"+unitPrice+"\t总价："+totalPrice);

        }
    }
}
