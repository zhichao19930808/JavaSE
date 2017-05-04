package reflect;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2017/5/4.
 * 利用反射机制，尝试获取一个私有的域的值
 */
 class Test {
    private int age;

    Test(int age) {
        this.age = age;
    }
}
class test1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Test test = new Test(29);
        Field age = Class.forName("reflect.Test").getDeclaredField("age");
        age.setAccessible(true);
        System.out.println(age.get(test));
    }
}
