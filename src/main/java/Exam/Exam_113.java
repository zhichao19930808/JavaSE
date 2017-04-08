package Exam;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Queue;

/**
 * Created by Administrator on 2017/4/8.
 * 编写一个java应用程序，要求如下：
 　　（1）声明一个String类的变量并初始化值“Hello World”。
 　　（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
 　　（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
 　　（4）声明一个String类的变量并初始化值“20100110”。
 　　（5）将上面变量的值转换成2010年1月10日的形式打印输出。
 */
public class Exam_113 {
    public static void main(String[] args) {
//    （1）声明一个String类的变量并初始化值“Hello World”。
     String a = "Hello World";
//    （2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
    System.out.println(a.substring(0,5));
    System.out.println(a.substring(6,11));
//    （3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
        System.out.println(a.substring(0,5).toLowerCase());
        System.out.println(a.substring(6,11).toUpperCase());
//        （4）声明一个String类的变量并初始化值“20100110”。
        String b ="20100110";
//        （5）将上面变量的值转换成2010年1月10日的形式打印输出。
        System.out.println(b.replace("20100110","2010年1月10日"));
}
}
