package url;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Util {

    public static void downLoad(String address,String file) {
                /*
         * 1,获取一个地址，并且将这个地址以url的方式初始化。
         2,建立和网络中地址的连接，在网络中寻找这个url，并将所指向的链接打开
         将url.openConnection转换为URLConnection的子类
         HttpURLConnection
         3，通过connection对象来获取想要的信息
         4，判断responseCode是否==200，是表示请求成功，否则输出 responseCode
         5，从网络中提取数据
         6，在本地创建文件用于写入数据
         7，用FileoutputStream往已经创建好的文件写入数据
         8，所有用到的流关闭，connection要断开 disconnect()
         */
        try {
            URL url = new URL(address);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int code = connection.getResponseCode();
            if (code == 200) {
                System.out.println("开始下载文件");
                int lenth = connection.getContentLength();
                InputStream inputStream = connection.getInputStream();
                System.out.println("文件大小："+lenth);

                System.out.println("写入本地文件");
                FileOutputStream outputStream = new FileOutputStream(file);
                int i = -1;
                byte chars[] = new byte[1024];
                while ((i = inputStream.read(chars)) > -1) {
                    outputStream.write(chars,0,i);
                }
                System.out.println("写入完成");
                outputStream.close();
                inputStream.close();
                connection.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
