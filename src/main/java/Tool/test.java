package Tool;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/11.
 * 获取地区名称
 */
public class test {
    public static void main(String[] args) throws IOException {
        Document documents = Jsoup.connect("http://bj.lianjia.com/ershoufang/rs/").cookie("lianjia_uuid", "3a4a801b-dbf8-4c15-b5a5-5599f2e77145").get();
//        1.获取地区名称
        System.out.print("[");
        for (Element element : documents.select("div[data-role] a[href*=ershoufang]")) {
            System.out.print("'"+element.text()+"',");
        }
        System.out.println("]");
//        2.获取地区拼音
        for (Element element : documents.select("div[data-role] a[href*=ershoufang]")) {
            System.out.println("'"+element.attr("href").replaceAll("(ershoufang|/)","")+"',");
        }
    }
}
