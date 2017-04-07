package Collection;

/**
 * Created by Administrator on 2017/4/7.
 */
public class StringTest {

    /**
     * @param args 主方法的参数数组
     * @author tester
     */
    public static void main(String[] args) {
        String s = "hi";
        System.out.println(s);
        s = "hello";
        System.out.println(s);

        // GC Garbage Collection 垃圾回收机制
        byte[] bytes = new byte[10];
        String s1 = ""; // deprecated 弃用\ [ˈdeprəkeɪtɪd]
        System.out.println("-" + s1 + "-");
        String s2 = "test...";//系统会首先从字符串池中寻找test，如果有则s2指向这个字符串
        String s3 = "test...";//系统会首先从字符串池中寻找test，如果有则s2指向这个字符串
       String s4 = new String ("test...");//无论字符串堆中有无test这个字符串，系统都会重新建立一个新的字符穿变量
            /*
        String Pool 字符串池
        "test..."
         */
        System.out.println(s2 == s3);//true
        System.out.println(s2==s4);//false
        System.out.println("hello".charAt(2));
        System.out.println("hello".concat(" world"));

    }
}
/*
charAt:返回指定索引的 char 值。索引范围是从零到 length() - 1。对于数组索引，序列的第一个 char 值是索引零，下一个是索引一，依此类推。
concat:将指定字符串连接到此字符串的结尾。
contains:检查指定的点是否在此对象的边界内，该点的 x 坐标和 y 坐标是相对于该对象的坐标系来定义的。
endsWith
equals
indexOf
lastIndexOf
length
replace
split
startWith
subString
toCharArray
toLowerCase
toUpperCase
trim
valueOf
 */