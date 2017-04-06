package OOP;

/**
 * Created by Administrator on 2017/4/6.
 * final
 终态
 可以修饰类、域和方法
 终态的类不能再被子类化
 终态的域
  只能在声明时或构造方法中被初始化
  初始化之后值不能再被修改
  终态的方法不能在子类中被重写
 静态并终态的域
 只能在声明时初始化
 初始化之后值不能再被修改
 常量，都是大写字母，单词之间用下划线 _ 分隔
 */
public /*final*/ class FinalTest {//终态类 终态的类不能再被子类化
    private final int i=0; //终态的域只能声明时或构造方法中被初始化，初始化后的值将不能被修改

    public /*final*/ void mothod() {//终态的方法不能在子类中被重写
        System.out.println("final....");
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
   //     finalTest=1;
    }
}

class subFinaTest extends FinalTest {
    public void mothod() {
        System.out.println("sub...");
    }
}