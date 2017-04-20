package Io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator on 2017/4/18.
 * Reader 基于字符的输入流
 */
public class ReaderTest {
    public static void main(String[] args) {
                Reader reader = null;
                try {
                    reader = new FileReader("test");
                    int i;
                    while ((i = reader.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

