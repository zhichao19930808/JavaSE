package Exceptional;

import java.io.FileNotFoundException;

/**
 * Created by Administrator on 2017/4/19.
 */
public class ThrowsTest {
    //自己写一个私有的仅供内部调用的方法，为了调用方便写成静态方法
    //在方法声明之处写一个throws ,后面抛出某一个异常类的类名;可以看到主方法调用此参数时会报出编译错误
    //throws 抛出；（关键字）
    private static void method() throws FileNotFoundException{
        System.out.println("method...");
    }
    public static void main(String[] args) {
        try {
            method();//这个编译错误是因为method方法声明时抛出了一个异常，并且这个异常是一个受检异常，要求调用这个方法的地方必须对他进行处理，不然不能通过编译。
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //两种处理方法，一种是 Add exception to method signature ；进一步在当前方法中抛出这个异常， 会在主方法后面出现 throws FileNotFoundException，
                 //但是因为主方法是java应用程序执行的入口，再往上已经没有别的方法了，会直接进入java虚拟机JVM
                 //一般情况下建议使用try_catch处理
    }
}
