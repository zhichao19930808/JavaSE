package reflect;

import OOP.Human;

/**
 * Created by Administrator on 2017/5/3.
 * Reflect [rɪ'flekt] 反映；反射；反省；归咎；显示
 */
public class Chinese extends Human {//创建一个中国人的类，并集成人类的类
    public Chinese(String name, char gender, int age, double height, double weight) {
        super(name, gender, age, height, weight);
    }
    private int i;

    public Chinese(String name, char gender, int age, double height, double weight, int i) {
        super(name, gender, age, height, weight);
        this.i = i;
    }

    public void m(String s) {
        System.out.println(s);
    }
}// Class<Chinese> chinese;

class ChineseTest {//run time 运行时

    public static void main(String[] args) throws ClassNotFoundException {
        Chinese chinese = new Chinese("小明",'男',18,1.70,65,1);
        Class<Chinese> chineseClass1 = Chinese.class;//使用ClassName.class方法获取chinese的实例对象；
        Class chineseClass2 = chinese.getClass();//使用instance.getClass()方法获取chinese的实例对象;
        Class chineseClass3 =Class.forName("");//使用Class.forName(String className)方法获取chinese的实例对象;
    }
}
