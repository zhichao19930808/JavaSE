package reflect.demo.b;

/**
 * Created by Administrator on 2017/5/5.
 * 底层实现类
 */
public class floppyWriter implements DeviceWriter{

    @Override
    public void writerToDevice() {
        //...
        System.out.println("writer to floppy...");
    }
}
