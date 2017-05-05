package reflect.demo.c;


import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Administrator on 2017/5/5.
 * 使用反射的方法实现 ：强耦合 -> 松散耦合-> 解耦合
 */
public class Service {
    public void write() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/java/reflect/demo/c/config.properties"));
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");
//            System.out.println(className);
//            System.out.println(methodName);
            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();

            //invoke(Object obj, Object... args)对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
            //newInstance(Object... initargs)使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，
            // 并用指定的初始化参数初始化该实例。
            method.invoke(constructor.newInstance());
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

}
