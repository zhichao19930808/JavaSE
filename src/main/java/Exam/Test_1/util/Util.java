package Exam.Test_1.util;

import Exam.Test_1.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Util {

    public void addUser(ArrayList<User> users) {
        String y;
        do {
            System.out.println("请输入学生的信息：");
            User user = new User();
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入id：");
            user.setId(scanner.nextInt());
            scanner.nextLine();
            System.out.println("输入姓名:");
            user.setName(scanner.nextLine());
            System.out.println("输入学号:");
            user.setNum(scanner.nextLine());
            System.out.println("输入家庭住址：");
            user.setAddress(scanner.nextLine());
            ArrayList<String> keCheng = new ArrayList<>();
            String n;
            do {
                System.out.println("输入用户所报名的课程信息：");
                keCheng.add(scanner.nextLine());
                System.out.println("是否继续添加课程y/n");
                n = scanner.nextLine();
            } while (n.equals("y") || n.equals("Y"));
            user.setKeCheng(keCheng);
            users.add(user);
            System.out.println("是否继续添加下一位学生的信息y/n");
            y = scanner.nextLine();
        } while (y.equals("y") || y.equals("Y"));
    }

    public void select(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
