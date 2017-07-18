package Exam.Test_2;

import java.io.*;
import java.util.Scanner;

public class Test_2 {
    /*
    接受用户输入的4个数字，并计算他们的和，差(从大开始)，绩。并将运算结果分别写入文件(文件名自定)
     */
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int a = scanner.nextInt();
        System.out.println("输入第二个数：");
        int b = scanner.nextInt();
        System.out.println("输入第三个数：");
        int c = scanner.nextInt();
        System.out.println("输入第四个数：");
        int d = scanner.nextInt();
        int sum = a+b+c+d;
        int abcd[] = {a, b, c, d};
        int max = abcd[0];
        for (int i = 0; i < 4; i++) {
            if (abcd[i] > max) {
                max = abcd[i];
                abcd[i] = abcd[0];
                abcd[0] = max;
            }
        }
        int cha = abcd[0] - abcd[1] - abcd[2] - abcd[3];
        System.out.println("和为："+sum);
        System.out.println("差为："+cha);


    }
}
