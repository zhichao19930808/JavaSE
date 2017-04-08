package Exam;

import Collection.StringBufferDemo;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/8.
 * 将一个数组中值为0的项去掉,将不为0的值存入一个新的数组,比如:
 　　int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
 　　生成的新数组为:
 　　int b[]={1,3,4,5,6,6,5,4,7,6,7,5}
 */
public class Exam_112 {

    public static void main(String[] args) {
        int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//        String x ="";
//        for (int i = 0; i <a.length ; i++) {
//            if (a[i] == 0) {
//                System.out.println(String.valueOf(a));
//                System.out.println();
//            }
//        }
        int d =0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == 0) {
                d++;
            }
        }
        int[]b= new int[a.length-d];
        int x =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[x]=a[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(b));
    }

}
