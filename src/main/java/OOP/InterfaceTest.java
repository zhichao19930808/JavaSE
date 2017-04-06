package OOP;

/**
 * Created by Administrator on 2017/4/6.
 * 接口 interface
 与类处于同一个级别
 接口的定义
 访问限定修饰符 interface 接口名
 [<类型参数列表 extends 父类型名 & 父类型名 & ...>]
 [extends 父接口名列表] {
 // 接口体
 }
 接口可以定义域和方法
 接口的域都是公有常量
 接口的方法都是公有抽象方法
 接口没有构造方法，不能实例化
 接口是用来被实现的 implements
 类实现接口必须实现接口的所有抽象方法
 Java 中，一个类可以实现多个接口
*抽象类与接口之间的联系和区别
 相同点
 都不能实例化
 都可以定义抽象方法
 对于他们的子（实现）类做了限制和约束
 不同点
 抽象类可以定义具体方法，接口不能
 类只能继承一个抽象类，可以实现多个接口
 接口本身可以继承 extends 多个父接口
 */
public interface InterfaceTest extends A, B {
    //接口可以定义域和方法
    //接口本身可以继承 extends 多个父接口

    int ZERO = 0;//接口的域都是公有常量
    void method();//接口的方法都是公有抽象方法
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}

class InterfaceTestImpl implements InterfaceTest,D {//接口是用来被实现的 implements
                                                  //类实现接口必须实现接口的所有抽象方法
                                                  //Java 中，一个类可以实现多个接口
    @Override
    public void method() {
        System.out.println("method...");
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override//-----------------------------------------Java 中，一个类可以实现多个接口
    public void d() {

    }
}

class T {
    public static void main(String[] args) {
      //  InterfaceTest interfaceTest0 =new InterfaceTest() {}// 接口没有构造方法，不能实例化
        InterfaceTestImpl interfaceTest = new InterfaceTestImpl();//
        interfaceTest.method();
        interfaceTest.b();
    }
}
