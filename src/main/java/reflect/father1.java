package reflect;

import Collection.StringTest;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/5/5.
 * 在运行时获取子类的类型参数
 */
public class father1<C> { // C - Career
}

class SonA extends father1<Doctor> {}
class SonB extends father1<Lawyer> {}
class SonC extends father1<Programmer> {}
class SonD extends father1<Programmer> {}

class Doctor {}

class Lawyer {}

class Programmer {}

class SonTest {
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();
        // son* > career?
        //Doctor
        Class clazz = sonA.getClass();//获取sonA的实例对象


        Type type =clazz.getGenericSuperclass();//返回sonA的实例对象的直接超类的type
        System.out.println(clazz.getGenericSuperclass());//reflect.father1<reflect.Doctor>
        // getGenericSuperclass()-》
        //Type 是 Java 编程语言中所有类型的公共高级接口。它们包括原始类型、参数化类型、数组类型、类型变量和基本类型。


        ParameterizedType parameterizedType = (ParameterizedType) type;
        System.out.println((ParameterizedType)type);//reflect.father1<reflect.Doctor>
        /*
        ParameterizedType 表示参数化类型，如 Collection<String>。
        参数化类型在反射方法首次需要时创建（在此包中指定）。
        当创建参数化类型 p 时，p 实例化的一般类型声明会被解析，并且按递归方式创建 p 的所有类型参数。
         */


        Type[] types = parameterizedType.getActualTypeArguments();
        System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));//[class reflect.Doctor]
        //getActualTypeArguments()-》返回表示此类型实际类型参数的 Type 对象的数组。


        Type t = types[0];
        System.out.println(t);//class reflect.Doctor


        Class aClass = (Class) t;
        System.out.println(aClass.getSimpleName());




    }
}
