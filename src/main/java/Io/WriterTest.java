package Io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Administrator on 2017/4/20.
 * 基于 字符 的输出流
 */
public class WriterTest {
    public static void main(String[] args) {
        //写入字符流的抽象类。子类必须实现的方法仅有 write(char[], int, int)、flush() 和 close()。
        // 但是，多数子类将重写此处定义的一些方法，以提供更高的效率和/或其他功能。
        Writer writer = null;
        try {
            writer = new FileWriter("new");//FileWriter 用来写入字符文件的便捷类。
            // 此类的构造方法假定默认字符编码和默认字节缓冲区大小都是可接受的。要自己指定这些值，可以先在 FileOutputStream 上构造一个 OutputStreamWriter。
            writer.write(Integer.parseInt("4e00", 16));//一
//            writer.write(0x4e01);//丁
            // 0b1111_1111_0000 b binary 二进制
            // 0111 八进制
            // 0x11
            System.out.println(11);
            writer.flush();//调用flush前 内容全部在缓存中，并未在文件中。调用flush会使缓存中的内容防盗硬件中，并使缓存为空
                           //调用close会来close前自动调用一次flush，所以在flush时有时可以不写
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}