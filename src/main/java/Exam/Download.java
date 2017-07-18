package Exam;

import Io.OutputStreamTest;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * Created by Administrator on 2017/5/6.
 * 编写一个程序，下载 百度 首页 logo 图片保存到本地
 */
public class Download {
    private static final String IMAGE_URL = "http://s.cn.bing.net/th?id=OJ.58V1JdyCq3tEwg&pid=MSNJVFeeds";

    public static void main(String[] args) {
        try {
            URL url=new URL(IMAGE_URL);
            try (
                    BufferedInputStream inputStream = (BufferedInputStream) url.openStream();
                    FileOutputStream outputStreamTest =new FileOutputStream("ooo.png")
            ) {
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStreamTest.write(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
