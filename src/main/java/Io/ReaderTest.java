package Io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2017/4/18.
 * Reader 基于字符的输入流 reader ['riːdə(r)] n. 读者；读物；读本
 */
public class ReaderTest {
    //用于读取字符流的抽象类。子类必须实现的方法只有 read(char[], int, int) 和 close()。
    // 但是，多数子类将重写此处定义的一些方法，以提供更高的效率和/或其他功能。
    public static void main(String[] args) {
        //JDK 7以上
        try (Reader reader = new FileReader("config.properties")) {//FileReader 用来读取字符文件的便捷类。
                                                                 // 此类的构造方法假定默认字符编码和默认字节缓冲区大小都是适当的。
                                                                  // 要自己指定这些值，可以先在 FileInputStream 上构造一个 InputStreamReader。
            int i;
            while ((i = reader.read()) != -1) {//read 试图将字符读入指定的字符缓冲区。
                System.out.print((char) i);
            }
        } catch (java.io.IOException e) {
                e.printStackTrace();
        }
        /*  JDK 7以下
                Reader reader = null;
                try {
                    reader = new FileReader("config.properties");
                    int i;
                    while ((i = reader.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                */
    }
}

