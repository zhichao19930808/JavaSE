package Io;

import java.io.*;

/**
 * Created by Administrator on 2017/4/20.
 */
public class InputStreamOutputStream {
    private static final String PATH = "src/main/java/Io/";
    public static void main(String[] args) {
        /*
        将当前文件件传入至内存，然后传出至新的文件out。java中
         */
        try (
                InputStream inputStream = new FileInputStream(PATH.concat("InputStreamOutputStream.java"));
                OutputStream outputStreamTest = new FileOutputStream(PATH.concat("out.java"))
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStreamTest.write(i);
            }
        } catch (IOException e) {
                    e.printStackTrace();
        }
    }
}
