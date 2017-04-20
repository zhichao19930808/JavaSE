package Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2017/4/20.
 * 基于 字节 的输出流
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        OutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream("new");
            outputStream.write(97);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
