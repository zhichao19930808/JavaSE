package Collection;

import java.util.Arrays;

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
//charAt:返回指定索引的 char 值。索引范围是从零到 length() - 1。对于数组索引，序列的第一个 char 值是索引零，下一个是索引一，依此类推。

        System.out.println("hello".charAt(2));//序列2的字符是：l
//concat:链接； 将指定字符串连接到此字符串的结尾。
        System.out.println("hello".concat(" world"));//串联起来的结果为：hello world

// contains:包含； 检查指定的点是否在此对象的边界内，该点的 x 坐标和 y 坐标是相对于该对象的坐标系来定义的。
        System.out.println("test1".contains("1"));//该字符串内包含有1，所以结果为：true
//endsWith:结束 包括；测试此字符串是否以指定的后缀结束。
        System.out.println("test1".endsWith("t2"));//该字符串后缀不是指定后缀（t2），所以结果为false；

//equals：相等的； 将此字符串与指定的对象比较。当且仅当该参数不为 null，并且是与此对象表示相同字符序列的 String 对象时，结果才为 true。
        System.out.println("test1".equals("Test1"));//由于首字母大小写不一样，所以结果为：false
        //equalsIgnoreCase 忽略大小写
        System.out.println("test1".equalsIgnoreCase("Test1"));//忽略了大小写，所以结果为：true
//indexOf：index 索引；  返回在此对象表示的字符序列中第一次出现该字符的索引；如果未出现该字符，则返回 -1。
        System.out.println("test1".indexOf("s")); // s在这个字符串中第一次出现该字符的索引是第三个字符，所以返回索引：2

//lastIndexOf：返回指定字符在此字符串中最后一次出现处的索引。
        System.out.println("test1".lastIndexOf("t")); // t在这个字符串中最后一次出现的位置是第4个字符，所以返回索引：3

//length：长度；  返回由此抽象路径名表示的文件的长度。如果此路径名表示一个目录，则返回值是不确定的。
        System.out.println("test1测试".length());//这个字符串的长度是7，所以返回：7。

//replace：代替；替换；  返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        System.out.println("tets1".replace("ts", "哈哈"));//将"ts"替换为"哈哈"，所以输出的结果为："tet哈哈1";

//split:分裂;   根据匹配给定的正则表达式来拆分此字符串
        System.out.println(Arrays.toString("test1".split("1")));//将“1”拆分出去后输出的结果为：[test]

//startsWith：start 开始;   测试此字符串是否以指定的前缀开始。
        System.out.println("test1".startsWith("tes"));//这个字符是以"tes"开始的，所以返回：true

//subString：返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。
        System.out.println("test1".substring(1, 4));//索引是1,4.所以输出的结果为：est

//toCharArray：将此字符串转换为一个新的字符数组。
        System.out.println(Arrays.toString("test1".toCharArray()));//转换后结果为：[t, e, s, t, 1]

//toLowerCase：lowercase 小写体的；   使用默认语言环境的规则将此 String 中的所有字符都转换为小写。这等效于调用 toLowerCase(Locale.getDefault())。
        System.out.println("Hello".toLowerCase());//将 H 转换为小写后输出结果为：hello

//toUpperCase:UpperCase 大写的；   使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。
        System.out.println("Hello".toUpperCase());//转换后输出的结果为：HELLO;

//trim：trim 修剪；   返回字符串的副本，忽略前导空白和尾部空白。
        System.out.println("   test1 hello     ".trim()); //去前面的空白部分后输出的结果为：test1 hello

//valueOf：value 价值；   返回 Object 参数的字符串表示形式。
        System.out.println(String.valueOf(true));//将true以字符串的形式表现出来是：true
        System.out.println(String.valueOf(new char[]{'t', 'e', 's', 't'}));//将数组以字符串的形式表达出来是：test
    }
}
