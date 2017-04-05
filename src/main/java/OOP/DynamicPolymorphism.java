package OOP;

/**
 * Created by Administrator on 2017/4/5.
 * 动态多态性
 * 子类和父类之间
 * 子类 重写 overwrite / 覆盖 override 了父类的方法（有相同的声明，访问权限可扩大）
 * 子类是否调用、子类在何处调用父类的方法根据方法的定义和需求确定
 */
public class DynamicPolymorphism {//dynamic 动态的
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.method();
        SubClass1 subClass1 = new SubClass1();
        subClass1.method();
        SubClass2 subClass2 = new SubClass2();
        subClass2.method();

    }
}
//-----------------------------------------------------父类
class SuperClass {//超类；父类；super 超级的；
    //随便定义一个无参无返回值的方法
    public void method() {//method 方法
        System.out.println("method in super class...");

    }
}

//------------------------------------------------------子类
 /*
 * 在子类和父类之间，如果存在同名方法的话，这个过程就叫动态多态性；叫方法的重写或覆盖，一般用覆盖；*/
class SubClass1 extends SuperClass{//子类
    //创建一个和父类同名的方法---创建subclass前 结果为：当前子类未被使用，
                               //创建subclass后 结果为：调用当前子类文件，输出了“method in sub class”
    /*
    如果给这个子类加上任意参数如“int i”，这个参数将不会被调用，结果将是会执行两次父类的方法；
     因为“subclass.method();”不满足这个子类方法的声明，但是由于子类继承父类的方法，所以调用的是父类的方法。
     */
    public void method() {
        System.out.println("method in sub class 1...");
    }
}

//      使用 shift+f6 可以快速更改子类的类名。
//-----------------------------------------------------------子类2
class SubClass2 extends SuperClass {
//      ctrl+o 快捷键：子类快速重写父类方法
    @Override//注释类型；表明当前方法是子类覆盖了父类的方法；不写也可以；
    public void method() {
        super.method();//虽然子类覆盖了父类的方法，但由于子类没有对父类方法做出任何修改，所以仍调用父类的方法;这句话可以注释掉不要
        System.out.println("method in sub class 2...");
    }
}
