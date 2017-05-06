package Exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/6.
 * Switch语句
 */
public class SwitchTest {
    /*
    利用 switch 语句将学生成绩分级,
    当从键盘中输入学生成绩在 100~90 范围时,输出“优 秀”,
    在 89~80 范围时输出“良好”,
    在 79~70 范围时输出“中等”,
    在 69~60 范围时输出 “及格”,
    在 59~0 范围时输出“不及格”,
    在其他范围时输出“成绩输入有误!”。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        int x;
        if (score>100&&score<110) {
             x = 11;
        } else {
            x=score/10;
        }
        switch (x) {
            case 10:
                System.out.println("优秀");
                break;
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 60:
                System.out.println("及格");
                break;
                default:
                    if (x >= 0 && x < 6) {
                        System.out.println("不及格");
                    } else {
                        System.out.println("成绩输入有误!");
                    }

        }
    }
}
