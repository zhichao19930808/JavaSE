package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * Created by Administrator on 2017/5/4.
 * 利用反射机制，获取human类的构造方法
 */
public class HumanTest2 {
    /*
    Constructor [kən'strʌktə]建造者；制造商；造船技师；构造函数；构造器
    Constructor 提供关于类的单个构造方法的信息以及对它的访问权限。
     */
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = Human.class;

        Constructor[] constructors =clazz.getConstructors();
        System.out.println("---getConstructors---");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());//getName()以字符串形式返回此构造方法的名称。
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println(parameter.getName());
            }
        }

        Constructor[] declaredConstructor = clazz.getDeclaredConstructors();
        System.out.println("---getDeclaredConstructors---");
        for (Constructor constructor : declaredConstructor) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println(parameter.getName());
            }
        }
        Constructor constructor = clazz.getDeclaredConstructor(int.class, double.class, String.class, boolean.class);
        System.out.println(constructor.getName());
        for (Parameter parameter : constructor.getParameters()) {
            System.out.println(parameter);
        }

    }
}
