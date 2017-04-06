package OOP;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2017/4/6.
 * static
 静态
 可以修饰域和方法
 静态的成员隶属于类对象
 静态方法中只能直接引用静态成员
 静态方法中不能使用 this 和 super
 方法中不能定义静态变量
 静态导入（JDK 1.5+）
 import static java.lang.System.out
 静态块 static block
 静态块在类加载时自动执行一次, 之后不再执行
 static {
 // ...
 }
 */

public class Manking {//manking 人类
    //Static 静态  dynamic 动态
    String name;
    static String earth;//earth 地球
    /*
静态并终态的域
只能在声明时初始化
初始化之后值不能再被修改
常量，都是大写字母，单词之间用下划线 _ 分隔
  */
    private static final int ONE_TWO = 12;

    public Manking(String name) {
        System.out.println(name + " constructor...");
    }

    static {//静态块 静态块在类加载时自动执行一次, 之后不再执行
        System.out.println("static block...");
    }

    class A {} // Inner class 内部类
}

class Text {
    public static void main(String[] args) {
        Manking tom = new Manking("tom");
        tom.name = "Tom";
        Manking.earth = "Tom 种了一棵树";
        System.out.println(tom.name);
        System.out.println(Manking.earth);

        Manking jerry = new Manking("jerry");
        jerry.name = "Jerry";
        System.out.println(jerry.name);
        System.out.println(Manking.earth);
    }
}
