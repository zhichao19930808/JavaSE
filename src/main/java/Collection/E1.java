package Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/4/12.
 */
// 编写一个学生类，将学生的姓名，年龄，性别分别保存到 HashSet ArrayList Hashtable 中
// 并利用迭代器 Iterator 将姓名，年龄，性别打印出来
public class E1 {

    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Tom", 18, 'M'));
//        students.add(new Student("Jerry", 17, 'F'));

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Tom", 18, 'M'));
        students.add(new Student("Jerry", 17, 'F'));

        Iterator<Student> iterator = students.iterator();
        // itit + Tab
        while (iterator.hasNext()) {
            Student student = iterator.next();

            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getGender());
        }
    }
}

class Student {
    private String name;
    private int age;
    private char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}