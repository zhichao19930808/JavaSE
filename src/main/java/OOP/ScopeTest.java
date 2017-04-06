package OOP;

/**
 * Created by Administrator on 2017/4/6.
 * 变量作用域范围
 * 变量（方法）产生作用的有效范围
 ***类作用域范围
 类的起始 { 到类的终止 }
 类的域和方法
 ***块 block 作用域范围
 从变量声明之处，到当前块结束之处
 ***方法中的局部变量 local variable，方法的参数，循环的变量
 */
public class ScopeTest { //scope 范围
    public void m(String s) {
        System.out.println(i);
        int j=0;//块成员变量作用域范围：从变量声明处，到当前块结束之处；方法中的局部变量、方法的参数、循环的变量
        System.out.println(j);
        for (int k = 0; k <7; k++) {}//、循环的变量；
        int i=1;//方法内的局部变量可以覆盖同名的域
        System.out.println(i);
        System.out.println(ScopeTest.i);
        System.out.println(s);//方法的参数

    }
    private static int i=9;//域成员变量作用于域范围： 类的其实{ 到类的终止}；类的域和方法

    public static void main(String[] args) {
        ScopeTest scopeTest =new ScopeTest();
        scopeTest.m( "qq");
    }
}
