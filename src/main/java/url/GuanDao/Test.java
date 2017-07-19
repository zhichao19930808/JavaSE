package url.GuanDao;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.sql.Connection;

public class Test {
    private static PipedInputStream inputStream = null;
    private static PipedOutputStream outputStream= null;

    public static void inint() {
        //关联管道
        try {
//     1.构造方法关联
            inputStream = new PipedInputStream();
//            outputStream = new PipedOutputStream(inputStream);
            outputStream = new PipedOutputStream();

//     2.connect方法关联
            inputStream.connect(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Test.inint();
        Run_1 run_1 = new Run_1(Test.outputStream);
        Run_2 run_2 = new Run_2(Test.inputStream);

        new Thread(run_1).start();
        new Thread(run_2).start();
    }
}
