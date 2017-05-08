package Exam;

import javax.lang.model.element.Name;
import java.io.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/6.
 * 用输入/输出写一个程序,让用户输入一些姓名和电话号码。每一个姓名和号码将加在文件 里。
 */
public class InputAndOutput {
    /*
    用输入/输出写一个程序,让用户输入一些姓名和电话号码。每一个姓名和号码将加在文件 里。
    用户通过点”Done”按钮来告诉系统整个列表已输入完毕。
    如果用户输入完整个列表, 程序将创建一个输出文件并显示或打印出来。格式如:
Tom
123-456-7890
Jerry
987-654-3210
     */
    public static void main(String[] args) {
        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("good"));
        ) {
            int x =2;//人数
            boolean heihei;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("请输入您的姓名：");
                String name =scanner.next();
                bufferedWriter.write(name);
                bufferedWriter.newLine();
                System.out.println("请输入您的电话号码：");
                String num = scanner.next();
                bufferedWriter.write(num);
                bufferedWriter.newLine();
                System.out.println("停止输入请输入Done，否则请输入任意键");
                String hehe =scanner.next();
                if (hehe.equals("Done")) {
                    heihei = false;
                } else {
                    heihei = true;
                }
            }while (heihei);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try(
                BufferedReader reader = new BufferedReader(new FileReader("good"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
