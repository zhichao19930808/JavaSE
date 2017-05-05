package reflect.demo.b;

/**
 * Created by Administrator on 2017/5/5.
 * 高层应用类
 */
//强耦合 -> 松散耦合 解耦合
public class Servace {
    private DeviceWriter deviceWriter;
//解决空指针异常：
    //1.创建构造方法
    /*
    public Servace(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }
    */
    //2.创建一个set方法
    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writerToDevice();
    }
}
