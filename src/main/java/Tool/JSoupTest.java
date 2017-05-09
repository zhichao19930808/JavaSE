package Tool;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/8.
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {

        Document document =Jsoup.connect("http://jandan.net/2017/05/08/space-emits-radio.html").get();
//        System.out.println(document);
        Elements elements = document.select("img[class=lazy]");
        for (Element element : elements) {
            System.out.println("http"+element.attr("data-original"));
        }
    }
}
