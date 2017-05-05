package reflect;

/**
 * Created by Administrator on 2017/5/5.
 * 1.通过子类son获取父类的名字
 * 2.通过子类son获取接口的名字
 */
public class Father {}
interface InterfaceTest{}
class Son extends Father implements InterfaceTest{

}

class ReflectTest {
    public static void main(String[] args) {
        Son son = new Son();
        Class clazz = son.getClass();
        System.out.println(clazz.getSuperclass());
        System.out.println(clazz.getInterfaces()[0]);
    }

}