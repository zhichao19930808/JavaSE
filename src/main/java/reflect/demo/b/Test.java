package reflect.demo.b;

/**
 * Created by Administrator on 2017/5/5.
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
//        Servace servace = new Servace(new floppyWriter());
        Servace servace =new Servace();
        servace.setDeviceWriter(new floppyWriter());
        servace.write();
    }
}
