package Exam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * Created by Administrator on 2017/5/6.
 * 使用反射机制获取 java.lang.String 类的所有域、构造方法、成员方法
 */
public class ReflectToString {
    public static void main(String[] args) {

    Class clazz = String.class;
        try {
            Constructor constructor = clazz.getDeclaredConstructor();
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println(parameter);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
