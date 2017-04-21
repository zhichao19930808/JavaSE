package Io;

import Exceptional.test;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * Created by Administrator on 2017/4/18.
 * InputStream  基于字节的输入流
 */
public class InputStreamTest {
    //此抽象类是表示字节输入流的所有类的超类。需要定义 InputStream 子类的应用程序必须总是提供返回下一个输入字节的方法。

    public static void main(String[] args) {
        InputStream inputStream=null;
        //shift+enter 快速跳出本行并另起一行
        try {//shift+ctrl+箭头 一个单词一个单词的选择
            inputStream = new FileInputStream("test ");//这个类所有的方法都声明了首检异常
                                                                //FileInputStream 从文件系统中的test文件中获得输入字节。哪些文件可用取决于主机环境。
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char)i);//输出i，并强转为字符类型
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null) {
                try {
                    inputStream.close();//关闭此输入流并释放与该流关联的所有系统资源。
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
