package Exceptional;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/18.
 */
public class test {
    public static void main(String[] args) {
        test();


    }

    private static void test() {
        //extract method 抽取方法  ctrl + alt + m
        System.out.println("input a file name");
        Scanner scanner = new Scanner(System.in);
        String fileName =scanner.next();
        try {
            RandomAccessFile randomAccessFile =new RandomAccessFile(fileName,"r");

        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            //serr 快速生成
            System.err.println("file not found");
            test();//递归 recursive
        }
    }
}
