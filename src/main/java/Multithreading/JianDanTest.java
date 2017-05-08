package Multithreading;

import java.io.*;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/5/8.
 * 多线程下载煎蛋网上关于天体前18页的图片
 */
public class JianDanTest implements Runnable{
    private static int counter = 0;
    private static final String PAGE_URL = "http://jandan.net/tag/%E5%A4%A9%E6%96%87/page/";
    private int page=0;

    public JianDanTest(int page) {
        this.page=page;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            System.out.println("page: " + (i + 1));
            Thread thread = new Thread(new JianDanTest( i+ 1));
            thread.start();
        }
    }
    @Override
    public void run() {
        try {
            URL url = new URL(PAGE_URL + page);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("data-original")) {
                        String imageUrl = line.substring(line.indexOf("data-original=\"") + "data-original=\"".length(), line.indexOf("\" width"));
                        if (!imageUrl.startsWith("http")) {
                            imageUrl = "http:" + imageUrl;
                        }
                        String extension = imageUrl.substring(imageUrl.lastIndexOf("."));
                        download(imageUrl, extension);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    private static void download(String imageUrl, String extension) {
        try {
            URL url = new URL(imageUrl);
            try (
                    BufferedInputStream in = new BufferedInputStream(url.openStream());
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("images/ " + (++counter) + extension))
            ) {
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
                System.out.println("\t" + counter);
            } catch (ConnectException e) {
                System.out.println("timeout...");
                download(imageUrl, extension);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


}
