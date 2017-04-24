package Exam;

import java.io.*;

/**
 * Created by Administrator on 2017/4/22.
 * 编写一个程序,其功能是将两个文件的内容合并到一个文件中
   例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef
 */
public class Exam_143 {
    public static void main(String[] args) {
        try (   InputStream inputStream = new FileInputStream("1.txt");
                InputStream inputStream1 = new FileInputStream("2.txt");
                OutputStream outputStreamTest = new FileOutputStream("3.txt")){
          int i;
            while ((i = inputStream.read()) != -1) {
                outputStreamTest.write(i);
            }
            while ((i = inputStream1.read()) != -1) {
                outputStreamTest.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
