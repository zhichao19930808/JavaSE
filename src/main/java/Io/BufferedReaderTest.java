package Io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/21.
 * BufferedReaderTest
 */
public class BufferedReaderTest {
    //BufferedReader 从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
    //可以指定缓冲区的大小，或者可使用默认的大小。大多数情况下，默认值就足够大了。
    private static final String FILE = "src/main/java/io/BufferedReaderTest.java";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;//读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
