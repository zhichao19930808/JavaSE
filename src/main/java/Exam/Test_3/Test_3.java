package Exam.Test_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_3 {
    /*
打印99乘法表，并将结果输入到文件(文件名自定)     */

    public static void main(String[] args) {
        try {
            File file = new File("E:\\99.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter("E:\\99.txt");
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j <= i; j++) {
                    fileWriter.write(""+j+"*"+i+"="+(j*i)+"\t");
                    System.out.print(j+"*"+i+"="+(j*i)+"\t");
                }
                fileWriter.write("\n");
                System.out.println("");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
