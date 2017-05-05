package reflect.demo.a;

/**
 * Created by Administrator on 2017/5/5.
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new PortableHdWriter());
        service.write();
    }
}
