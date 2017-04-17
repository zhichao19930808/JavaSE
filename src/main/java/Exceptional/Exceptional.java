package Exceptional;

/**
 * Created by Administrator on 2017/4/17.
 * 常见异常
 */
public class Exceptional {
    public static void main(String[] args) {
//        System.out.println("hello".charAt(5));//字符串下标越界 java.lang.StringIndexOutOfBoundsException
        //此异常由 String 方法抛出，指示索引或者为负，或者超出字符串的大小。对诸如 charAt 的一些方法，当索引等于字符串的大小时，也会抛出该异常。

//        System.out.println(new int[]{1,3,2}[3]);//数组下标越界 ArrayIndexOutOfBoundsException
        //用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。

//        System.out.println(1/0); //算术异常 java.lang.ArithmeticException
        //当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。

//          System.out.println(Integer.valueOf("l23"));//数字格式化异常  java.lang.NumberFormatException
        //当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。

        String s = "hi";
        //若干行后
        s=null;
        //再若干行后
        System.out.println(s.toUpperCase());//空指针异常 java.lang.NullPointerException
        //当应用程序试图在需要对象的地方使用 null 时，抛出该异常。

    }
}
