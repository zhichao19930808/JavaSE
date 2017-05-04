package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/27.
 * 正则表达式matcher.find和matcher.group练习
 */
public class ReagexTest {
    public static void main(String[] args) {
//        Pattern ['pætn]模式
//        Matcher ['mætʃə]匹配
        System.out.println("----------------------------------------------------------------");
        /*
        正则表达式的编译表示形式。
指定为字符串的正则表达式必须首先被编译为此类的实例。
然后，可将得到的模式用于创建 Matcher 对象，依照正则表达式，该对象可以与任意字符序列匹配。
执行匹配所涉及的所有状态都驻留在匹配器中，所以多个匹配器可以共享同一模式。
因此，典型的调用顺序是

 Pattern p = Pattern.compile("a*b");
 Matcher m = p.matcher("aaaaab");
 boolean b = m.matches();
 在仅使用一次正则表达式时，可以方便地通过此类定义 matches 方法。
 此方法编译表达式并在单个调用中将输入序列与其匹配。语句
 boolean b = Pattern.matches("a*b", "aaaaab");等效于上面的三个语句，
 尽管对于重复的匹配而言它效率不高，因为它不允许重用已编译的模式。
此类的实例是不可变的，可供多个并发线程安全使用。Matcher 类的实例用于此目的则不安全。

         */
        Pattern pattern = Pattern.compile("l");//compile  [kəm'paɪl]编译
        Matcher matcher = pattern.matcher("hello");
        //matcher.find 查找"hello"中有没有"l"如果有返回true，否则返回"false"
//        System.out.println(matcher.find());//true//[ boolean ] find()尝试查找与该模式匹配的输入序列的下一个子序列。
        //matcher.find方法有一个类似于指针的配件理解，会继续寻找下一个。
        //matcher.group 返回的是上一次找到的结果
        while (matcher.find()) {
            System.out.println(matcher.group());//l l// [String] group()返回由以前匹配操作所匹配的输入子序列。
        }
        System.out.println("----忽略大小写,在compile方法中使用compile的第二个方法,加入第二个参数CASE_INSENSITIVE----");
        //CASE_INSENSITIVE=0x02 case 例子▲insensitive 英 [ɪn'sensətɪv]adj. 不敏感的；
//        Pattern pattern1 = Pattern.compile("l", Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile("(?i)l");//通过嵌入式标志表达式（？i），也可以启用不区分大小写的匹配
        Matcher matcher1 = pattern1.matcher("HELLO");
//        System.out.println(matcher1.find());
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }
}
