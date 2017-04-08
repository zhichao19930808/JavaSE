package Exam;

/**
 * Created by Administrator on 2017/4/8.
 * 按以下要求编写程序
 (1) 编写 Animal 接口，接口中声明 eat() 方法
 (2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有 flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
 (3) 编写 Bird 类和 Fish 类的测试程序，并调用其中的各个方法
 */
public interface Animal {
//    (1) 编写 Animal 接口，接口中声明 eat() 方法
    public void eat();
//    (2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有 flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
}

class Bird implements Animal {//bird 鸟

    @Override
    public void eat() {
        System.out.println("早起的鸟儿有虫吃");
    }

    public void flaying() {
        System.out.println("笨鸟先飞");
    }
}

class Fish implements Animal {//Fish 鱼

    @Override
    public void eat() {
        System.out.println("大鱼吃小鱼，小鱼吃虾米");
    }
    public void swimming() {
        System.out.println("游啊游，吃啊吃");
    }
}

class BirdAndFishText {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.flaying();
        Fish fish = new Fish();
        fish.eat();
        fish.swimming();
    }
}