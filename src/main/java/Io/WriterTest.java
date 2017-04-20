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
        Writer writer = null;
        try {
            writer = new FileWriter("new");
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