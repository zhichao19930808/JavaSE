package ZhiDao;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/10.
 * 程序中如果我输入yes,程序进行循环.输入no，程序跳出，输入其他字符则重新进行yes和no的选择，应该怎么做
 */
public class XunHuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            boolean flag2 = true;
            System.out.println("---外循环---");
            while(flag2){
                flag2 = false;
                System.out.println("是否继续循环？yes/no");
                String str = sc.next();
                switch (str) {
                    case "yes":
                        flag = true;
                        break;
                    case "no":
                        flag = false;
                        break;
                    default:
                        System.out.println("---内循环---");
                        System.out.println("输入错误请重新输入");
                        flag2 = true;
                        break;
                }
            }
        }
        System.out.println("已退出循环");
    }

}
