package Exam.Test_1;

import Exam.Test_1.util.Util;

import java.util.ArrayList;

public class Test_1 {
    public static void main(String[] args) {
        /*
        输入学生的姓名，学号，家庭住址信息，和用户所报名的课程信息(例如，张三报名了java课程和R语言的课程。
        课程可以是多个)用户输入n／N停止输入然后将所有学生的数据输出。
要求：1:使用集合存放学生数据和学生报名课程数据，要有关联
      2:所有的学生信息都需要使用实体类。
      3:main方法中只能有对象创建和方法调用
         */
        ArrayList<User> users = new ArrayList<>();
        Util util = new Util();
        util.addUser(users);
        util.select(users);
    }
}
