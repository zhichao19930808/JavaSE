package Io;

import Exceptional.test;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * Created by Administrator on 2017/4/18.
 * InputStream  基于字节的输入流
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream=null;
        //shift+enter 快速跳出本行并另起一行
        try {//shift+ctrl+箭头 一个单词一个单词的选择
            inputStream = new FileInputStream("test ");//这个类所有的方法都声明了首检异常
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
