package Multithreading.Exam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/5/13.
 * 使用多线程同时下载以下两个视频 20分
 https://gifshow-static.download.ks-cdn.com/video/home-1.mp4
 https://gifshow-static.download.ks-cdn.com/video/home-2.mp4

 */
public class Exam_8 implements Runnable{
    private  String url;
    private  String fileName;

    public Exam_8(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    public static void main(String[] args) {
        String urla = "https://gifshow-static.download.ks-cdn.com/video/home-1.mp4";
        String urlb = "https://gifshow-static.download.ks-cdn.com/video/home-2.mp4";

        Thread thread1 = new Thread(new Exam_8(urla,"aaa"));
        Thread thread2 = new Thread(new Exam_8(urlb,"bbb"));

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        try {
            URL Url = new URL(url);
            try(
                    BufferedInputStream inputStream = new BufferedInputStream(Url.openStream());
                    BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName))
            ) {
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
