package OOP;

/**
 * Created by Administrator on 2017/4/7.
 */
public class Main {
    public static void main(String[] args) {
        Foo f = new Foo("f");
        System.out.println(f.getS()); // "f"
        changeReference(f);
//        modifyReference(f);
        System.out.println(f.getS()); // "f"
    }

    private static void changeReference(Foo a) {
        System.out.println(a.getS()); // "f"
        Foo b = new Foo("b");
        a = b;
    }

    private static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    private String s;

    Foo(String s) {
        this.s = s;
    }

     void setAttribute(String s) {
        this.s = s;
    }

     String getS() {
        return s;
    }
}
/*
* “引用传递”
传递参数的地址（也是值传递）
Is Java “pass-by-reference” or “pass-by-value”?
方法的参数是引用数据类型
方法中的改变会影响实际参数
注意：String类型以及基本数据类型的封装类是特例（还是值传递）
String immutable
primitive Wrapper*/
