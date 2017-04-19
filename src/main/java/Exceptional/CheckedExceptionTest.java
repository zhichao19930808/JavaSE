package Exceptional;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2017/4/19.
 */
public class CheckedExceptionTest {//checked [tʃekt]检查；阻止；核对（动词check的过去式和过去分词）
                                   //exception [ɪk'sepʃn] 异常
    public static void main(String[] args) {
        // RandomAccessFile来自java语言的io包（i是input的意思 o是output的意思）（数据流）输入输出包
        //RandomAccessFile 随机访问文件类；或关于文件的随机访问类    random ['rændəm] 随机的  Access['ækses]进入；
        //受检异常的构造方法中有一条方法 throws fileNotFoundException使得受检异常必须对其进行处理
        try {
            RandomAccessFile randomAccessFile =new RandomAccessFile("","");
        } catch (FileNotFoundException e) {//ctrl+b 查看文件的类
            e.printStackTrace();
        }
    }
}
/*
非受检异常 unchecked exception
RuntimeException类及其子类是非受检异常
受检异常 checked exception
Exception类中除了RuntimeException之外的其他异常类及其子类
非受检异常可以通过编译，可能在运行时产生
受检异常不能通过编译，必须对其进行处理
受检异常的处理方式:
1.使用 try / catch 包围
2.在方法中声明这个异常 throws
 */