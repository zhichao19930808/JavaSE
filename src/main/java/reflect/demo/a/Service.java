package reflect.demo.a;

/**
 * Created by Administrator on 2017/5/5.
 * 高层应用类
 */
//强耦合
public class Service {//Service n.服务；发球；服役；公务部门；礼拜仪式；(车辆、机器等定期的)维修
//    private FloppyWriter floppyWriter;
    private PortableHdWriter portableHdWriter;
//    public Service(FloppyWriter floppyWriter) {
//        this.floppyWriter = floppyWriter;
//    }


    public Service(PortableHdWriter portableHdWriter) {
        this.portableHdWriter = portableHdWriter;
    }

    public void write() {
//        floppyWriter.writeToFloppy();
        portableHdWriter.writeToPortableHd();
    }
}
