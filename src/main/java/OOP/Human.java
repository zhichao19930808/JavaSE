package OOP;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Human {//定义一个类
    //定义域,设定姓名，性别，年龄，身高，体重；
    //private 私有的；
    private String name;
    private char gender;
    private int age;
    private double height;
    private double weight;


    //constructor 构造方法
    //定义方法；
    public Human(String name, char gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Human lala = new Human("活人",'男',22,173,65);
        System.out.println(lala.name);
        System.out.println(lala.gender);
        System.out.println(lala.age);
        System.out.println(lala.height);
        System.out.println(lala.weight);
    }
    // void adj.\ 空的；无效的；无人的；没有返回值；
    public String study(int studytime) {//设置一个学习的方法。
        System.out.println(name+"学习了"+studytime+"小时。");
        return "一份英语作业";
    }
    public void work( boolean b) {//设置一个工作的方法。
        if (b) {

        } else {
        }
    }
    public void eat( String foods,double amount) { //设置一个吃东西的方法。//amount 多少；数量；
        System.out.println("吃了"+amount+foods);
    }
    public int sleep(boolean isPlayGame) {//设置一个睡觉的方法
        return isPlayGame ? 1:8;

    }

}