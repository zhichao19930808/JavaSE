package OOP;

/**
 * Created by Administrator on 2017/4/4.
 * 交通工具（父类）
 * 自行车 轮船 飞机（子类）
 */
public class Vehicle {//vehicle 交通工具
    //fields ------------- 域
    String name; //名字
    double weight;//重量
    double price; //价值
    char color; //颜色

    //methods ----- --------- 方法
    //出发功能
    public void start() {//start 开始；出发
        System.out.println("vehicle is starting...");
    }

    //结束功能
    public void stop() {
        System.out.println("vehicle is stopped");
    }
    //完成无参构造方法的继承测试后，生成一个有参的构造方法 （alt+insert 快速生成构造方法）并测试
    public Vehicle(String name, double weight, double price, char color) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.color = color;
    }
}


//------------------------------------------------------------------------------------------------------------------------
//bicycle 自行车；  ship 轮船； plane 飞机； extands 继承
class Bicycle extends Vehicle {
    //fields-----------域
    String type; //种类：山地车 公路车等

    //子类必须显示调用父类的有参构造方法。
    public Bicycle(String name, double weight, double price, char color,String type) {//alt+Enter 显示意向操作及快速修复
        super(name, weight, price, color);//super 指代超类；调用了父类的有参（或无参）构造方法；加“.”可调用超类的成员方法；
    }

    //methods -------------方法
    //按铃功能
    public void ring() { //ring 鸣响；按铃
        System.out.println("bicycle is ringing...");
    }
}

//------------------------------------------------------------------------------------------------------------------------
class Ship extends Vehicle {
    //fields-----------域
    double tonnage; //吨位

    public Ship(String name, double weight, double price, char color, double tonnage) {//alt+insert 快速生成构造方法可直接生成包括子类的域的构造方法
        super(name, weight, price, color);
        this.tonnage = tonnage;
    }

    //methods------------方法
    //抛锚功能
    public void anchor() {//anchor 锚；抛锚
        System.out.println("ship is anchor...");
    }
}

//-----------------------------------------------------------------------------------------------------------------------
class Plane extends Vehicle {
    //fields------------域
    int engineNumber;//engine 发动机

    public Plane(String name, double weight, double price, char color, int engineNumber) {
        super(name, weight, price, color);
        this.engineNumber = engineNumber;
    }

    //methods-------------方法
    //飞行方法
    public void flying() {//flying 飞行
        System.out.println("plane is flying...");
    }
}

//------------------------------------------------------------------------------------------------------------------------
//测试类
class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("神州6号",1000,2000,'白');//调用交通工具本身（父类）；
        System.out.println( vehicle.color);//调用交通工具的颜色并输出；
        vehicle.start();//调用交通工具的开始方法；
        System.out.println("**************************************************");
        //-------------------------------------------
        Bicycle bicycle = new Bicycle("小黄车",10,600,'黄',"小黄车");//调用自行车（子类）；
        System.out.println(bicycle.color);//用子类（自行车）调用父类（交通工具）的颜色属性并输出；
        bicycle.start();//用子类调用交通工具的开始方法；
        System.out.println(bicycle.type);//调用子类自身的属性
        /*
        * 在自动生成的构造方法的参数的后面加入：“Sting（声明类型） type（域）”
        * 并在super后面写一个“this.type=type;”，然后在bicycle的参数中写入type的域值就可以为bicycle的type域附上初始值*/
        bicycle.ring();//调用子类自身的按铃方法
        System.out.println("**************************************************");
        //--------------------------------------------
        Ship ship = new Ship("轮船",1000,3000,'银',1000);
        System.out.println( ship.color);
        ship.start();
        System.out.println(ship.tonnage);//调用子类自身的吨位属性
        ship.anchor();//调用子类自身的抛锚方法;
        System.out.println("**************************************************");
        //--------------------------------------------
        Plane plane = new Plane("直升机",1000,9000,'银',990);
        System.out.println(plane.color);
        plane.start();
        System.out.println(plane.engineNumber);//调用子类自身的发动机号数属性
        plane.flying();//调用子类自身的飞行属性；
    }
}
