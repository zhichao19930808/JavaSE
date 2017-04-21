package Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2017/4/20.
 * 基于 字节 的输出流
 */
public class OutputStreamTest {
//    此抽象类是表示输出字节流的所有类的超类。输出流接受输出字节并将这些字节发送到某个接收器。
// 需要定义 OutputStream 子类的应用程序必须始终提供至少一种可写入一个输出字节的方法。

    public static void main(String[] args) {
        OutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream("new");//FileOutputStream 文件输出流是用于将数据写入 File 或 FileDescriptor 的输出流。
            outputStream.write(97);//write 将指定字节写入此文件输出流。
            outputStream.flush();//刷新此输出流并强制写出所有缓冲的输出字节。
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();//关闭此输出流并释放与此流有关的所有系统资源。
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
