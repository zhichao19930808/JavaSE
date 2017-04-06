package OOP;

/**
 * Created by Administrator on 2017/4/6.
 * abstract
 抽象：抽取“像”的部分
 可以修饰类和方法
 抽象类
   抽象的类不能实例化
   抽象的类是用来被扩展的
   抽象类的子类必须实现抽象类中所有的抽象方法
 抽象方法
   抽象的方法没有实现
   抽象的方法必须声明在抽象类中
   在抽象类的子类中被实现
 */
public abstract class AbstractText {
    private int i;

    public AbstractText(int i) {
        this.i = i;
    }

    public void method() {
        System.out.println("抽象类中可以有具体方法");
    }
    public abstract void method( int i );
    public abstract void method( int i,double q );

    public static void main(String[] args) {
//        AbstractText abstractText = new AbstractText() ; //抽象的类不能实例化; instantiated 实例化
        SubAbstract subAbstract = new SubAbstract(1);//抽象方法在抽象类的子类中被实现

    }
}

class SubAbstract extends AbstractText {//抽象类的子类必须实现抽象类中所有的抽象方法

    public SubAbstract(int i) {
        super(i);
    }

    public void method() {
        System.out.println("重载了抽象类的具体方法");
    }

    public void method(int i) {

    }
    public void method(int i,double q) {

    }

}