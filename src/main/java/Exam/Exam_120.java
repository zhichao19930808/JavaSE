package Exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Exam_120 {
    /*
    写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
例如：
-4.5 四舍五入的结果是-4
4.4 四舍五入的结果是4
     */
    public static void main(String[] args) {
        System.out.println("请输入一个浮点数值：");
        Scanner input =new Scanner(System.in);
        double x = input.nextDouble();
        double y =x*10%10;
        int z;
        if (x >= 0) {
            if (y >= 5) {
                z = (int) x + 1;
            } else {
                z = (int) x;
            }
        } else {
            if (y <= -5) {
                z = (int) x;
            } else {
                z = (int)x-1;
            }

        }

        System.out.println(z);
    }
}
