package Exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator
 * ++on 2017/4/8.
 * 接受用户输入的一个字符串，将其每个字节的数据相加求和输出
 */
public class Exam_111 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        //将数组中的每个数字相加
        int x=0;//和
        for (int i = 0; i <a.length() ; i++) {
            x+=a.charAt(i);
        }
        System.out.println(x);
    }
}
