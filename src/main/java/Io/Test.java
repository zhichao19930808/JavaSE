package Io;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/13.
 */
public class Test {
    private static final String FILETEST = "E:\\Test.txt";

    public static void main(String[] args) {
        Test a = new Test();
//        a.readFileByInputStream();//无法读取中文
//        a.readFileByFileReader();
//        a.readFileByInputStreamReader();
        a.writeFileByOutputStream();
        a.writeFileByBuffer();
        a.wirteFileByFileWriter();
    }

    private void readFileByInputStream() {
        try {
            File file = new File(FILETEST);

            if (file.exists() && !file.isDirectory()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                int i = -1;
                while ((i = fileInputStream.read()) > -1) {
                    System.out.print((char) i);
                }
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//字节流，每次读取一个字节。默认情况下不能读取中文

    private void readFileByFileReader() {
        try {
            File file = new File(FILETEST);

            if (file.exists() && !file.isDirectory()) {
                FileReader fileReader = new FileReader(file);
                int i = -1;
                char[] chars = new char[1024];
                while ((i = fileReader.read(chars)) > -1) {
                }
//                System.out.println(Arrays.toString(chars));
                for (int j = 0; j < chars.length; j++) {
                    System.out.print(chars[j]);
                }
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//字符流,每次读取一个字符,默认情况下可以读取中文

    private void readFileByInputStreamReader() {
        //字符流
        try {
            File file = new File(FILETEST);
            if (file.exists() && !file.isDirectory()) {
                FileInputStream inputStream = new FileInputStream(file);
                InputStreamReader reader = new InputStreamReader(inputStream);
                int i = -1;
                while ((i = reader.read()) > -1) {
                    System.out.print((char) i);
                }
                inputStream.close();
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//字符流，每次读取一个字符,默认情况下可以读取中文

    private void writeFileByOutputStream() {
        try {
            File file = new File("E:\\OutputStream.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            long timeStart = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                fileOutputStream.write("歌唱伟大的祖国,歌唱伟大的共产党\n".getBytes());
            }
//            fileOutputStream.close();
            long timeEnd = System.currentTimeMillis();
            System.out.print("歌唱伟大的祖国,歌唱伟大的共产党\n".getBytes().length);
            System.out.print("\nFileOutputStream用时:" + (timeEnd - timeStart) + "毫秒\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//字节流的方式写数据

    private void writeFileByBuffer() {
        try {
            File file = new File("E:\\Buffer.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream outputStream = new FileOutputStream(file);
            BufferedOutputStream buffer = new BufferedOutputStream(outputStream);
            long timeStart = System.currentTimeMillis();
            // Bytes类型的数组长度超出限制
            for (int i = 0; i < 1000000; i++) {
                buffer.write("歌唱伟大的祖国,歌唱伟大的共产党\n".getBytes());
                buffer.flush();//清空缓冲区
            }
            outputStream.close();
            buffer.close();
            long timeEnd = System.currentTimeMillis();
            System.out.print("BufferedOutputStream用时:" + (timeEnd - timeStart) + "毫秒\n");
        } catch (Exception e) {
        }
    }//以缓冲的字节流写入数据

    private void wirteFileByFileWriter() {

        try {
            File file = new File("E:\\FileWriter.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWirter = new FileWriter(file);

            long timeStart = System.currentTimeMillis();

            for (int i = 0; i < 1000000; i++) {

                fileWirter.write("歌唱伟大的祖国,歌唱伟大的共产党\n");
            }
            fileWirter.close();
            long timeEnd = System.currentTimeMillis();
            System.out.print("FileWriter用时:" + (timeEnd - timeStart) + "毫秒\n");
        } catch (Exception e) {

        }
    }//以缓冲的字节流写入数据
}
