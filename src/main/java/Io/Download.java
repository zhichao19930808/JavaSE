package Io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/4/20.
 * 下载指定路径的图片并重命名为"test.png"。
 */
public class Download {
    private static final String IMAGE_URL = "http://s.cn.bing.net/th?id=OJ.58V1JdyCq3tEwg&pid=MSNJVFeeds";

    public static void main(String[] args) {
        try {
//类 URL 代表一个统一资源定位符，它是指向互联网“资源”的指针。资源可以是简单的文件或目录，也可以是对更为复杂的对象的引用，例如对数据库或搜索引擎的查询。
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream inputStream = url.openStream(); // InputStream  基于字节的输入流
                                                                // url.openStream() 打开到此 URL 的连接 并返回一个用于从该连接读入的 InputStream。此方法是下面方法的缩写：
                                                                // openConnection().getInputStream()
                                                                //Connection 与特定数据库的连接（会话）。在连接上下文中执行 SQL 语句并返回结果。
                                                                //openConnection  返回一个 URLConnection 对象，它表示到 URL 所引用的远程对象的连接。
            OutputStream outputStream = new FileOutputStream("test.png")//OutputStream 基于字节的输出流
            ) {
                System.out.println(inputStream.available());
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
