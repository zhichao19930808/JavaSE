package Io;

import generic.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/21.
 * file练习
 */
public class FileTest {
    //file 文件和目录路径名的抽象表示形式
    public static void main(String[] args) {
        File file = new File("E:/javaHome/JavaSE/config.properties");//通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        System.out.println(file.isFile());//true  测试此抽象路径名表示的文件是否是一个标准文件。
        System.out.println(file.isDirectory());//false   测试此抽象路径名表示的文件是否是一个目录。
        System.out.println(file.canExecute());//true  Execute 执行 测试应用程序是否可以执行此抽象路径名表示的文件。
        System.out.println(file.canRead());//true  测试应用程序是否可以读取此抽象路径名表示的文件。
        System.out.println(file.canWrite());//true   测试应用程序是否可以修改此抽象路径名表示的文件。
        System.out.println(file.isHidden());//是否是隐藏文件
        System.out.println("----------------------------------------------------");
        //file.delete();//删除此抽象路径名表示的文件或目录
        //file.deleteOnExit();// 在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。
        System.out.println(file.getAbsoluteFile()); //E:\javaHome\JavaSE\config.properties 返回此抽象路径名的绝对路径名形式。
        System.out.println(file.getAbsolutePath());//E:\javaHome\JavaSE\config.properties  返回此抽象路径名的绝对路径名字符串
        System.out.println(file.getName());//config.properties  返回由此抽象路径名表示的文件或目录的名称。
        System.out.println(file.getParent());//javaHome\JavaSE  返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
        System.out.println(file.getParentFile());//javaHome\JavaSE  返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
        System.out.println("------------------------------------------------------");
        System.out.println(new Date(file.lastModified()));// date 日期  返回此路径名表示的最后一次被修改的时间
        System.out.println(file.setReadable(true));//true  设置此抽象路径名所有者读权限的一个便捷方法。
        System.out.println(file.setWritable(true));//true  设置此抽象路径名所有者写权限的一个便捷方法。

//        try {
//            System.out.println("create: " + file.createNewFile()); // 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////                for (File f : file.listFiles()) {//返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
////            System.out.println(f.isFile());
////        }
//        System.out.println(file.mkdirs()); // mk make dir directory 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。




    }
}
