package reflect;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2017/5/3.
 *  java.lang.reflect  提供类和接口，以获得关于类和对象的反射信息
 */
class Animale {//建立一个动物类
    public int age;//建立一个公开的域,年龄
    private double weight;//建立一个私有的域,体重

    public Animale() {
    }

    public Animale(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int sleep(int hours) {//定义一个睡觉的方法；
        return hours;
    }

    public void eat(String food) {//定义一个吃东西的方法
        System.out.println("eating"+food);
    }

    private void killHuman() {//定义一个杀人的方法 kill 杀
        System.out.println("kill a poor guy...");//杀死一个可怜的家伙
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
public class Human extends Animale{
    public String name;
    private boolean married;//已婚

    public Human() {
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {//重写父类吃的方法
        System.out.println(name+"eating"+food);
    }
    public void study(String course) {//定义一个学习的方法；course 课程
        System.out.println(name+"is now studying"+course    );
    }

    private void killAnimals(String Animals) {
        System.out.println(name+"is now kill"+Animals);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        Class clazz =human.getClass();//使用instance.getClass()方法获取chinese的实例对象;
                                      //instance ['ɪnstəns]	例子；
        Field[] fields = clazz.getFields();//Field 提供有关类或接口的单个字段的信息，以及对它的动态访问权限。
                                            // 反射的字段可能是一个类（静态）字段或实例字段。
                                            //getFields()返回一个包含某些 Field 对象的数组，
                                            // 这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段。
        System.out.println("--- getFields() ---");
        for (Field field : fields) {
            System.out.println(field.getName());//getName()返回此 Field 对象表示的字段的名称。
        }
        //getDeclaredFields()返回 Field 对象的一个数组，这些对象反映此 Class 对象所表示的类或接口所声明的所有字段。
        Field[] declaredFields = clazz.getDeclaredFields(); // declared 宣布\ [dɪ'kleəd] 声明
        System.out.println("--- getDeclaredFields() ---");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }
}
