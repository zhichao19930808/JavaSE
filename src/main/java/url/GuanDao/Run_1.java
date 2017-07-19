package url.GuanDao;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Run_1 implements Runnable {
    public Run_1(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private PipedOutputStream outputStream= null;
    @Override
    public void run() {
        try {
            System.out.println("Run_1：两秒后将数据发送至主线程");
            Thread.sleep(2000);
            outputStream.write("100".getBytes());
            outputStream.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
