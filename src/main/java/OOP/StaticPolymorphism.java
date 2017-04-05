package OOP;

/**
 * Created by Administrator on 2017/4/5.
 * 静态多态性
 *同一个类内部（也可以发生于子类和父类之间）
 *同名方法的重载 overload-----------同一个类内部的同名方法叫做静态多态性或重载。
 *参数不同
  * 类型不一样
  * 数量不一样
  * 顺序不一样
* ----------------------------------类的构造方法之间都是重载
 */
public class StaticPolymorphism {//静态多态

    public static void main(String[] args) {
Calculator calculator = new Calculator();
        System.out.println(calculator.add(9,10));
        System.out.println(calculator.add(9.0,10.0));
        System.out.println(calculator.add(9,10,11));
        System.out.println(calculator.add(9,2.0));
        System.out.println(calculator.add(9.0,2));
    }
}

//计算的方法；
class Calculator {
    public int add(int x,int y) {//以这个参数为标准
        return x + y;
    }

    //--------------------------1.参数类型不同

    public  double add(double x, double y) {//参数类型不一样（正确）
        return x+y;
    }
    /*
    public double add(int a,int b) {//这个方法虽然参数名不同，但是参数名并不重要，可以随便改，所以重载（错误）。
        return a-b;
    }
    */
    /*
    public double add(int a,int b) {//这个方法也是错误的，重载跟返回类型也是无关的。
        return 1d;
    }
    */
    //------------------------------2.参数数量不 同

    public int add(int a,int b,int c) {//参数数量不同，（正确）
        return a+b+c;
    }
    //------------------------------3.参数顺序不同

    public double add(int a,double b) {//（正确）
        return a+b;
    }
    public double add(double y,int x ){//参数顺序不同，（正确）
        return y-x;
    }

}
