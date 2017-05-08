package Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/11.
 * HashSetTest
 */
public class HashSetTest {
    /*
    * 特点：
    *       Set 不可以重复元素
    *   1、使用 HashMap 存储元素
    *   2、无序
    *   3、效率高
    * */
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("config.properties");
        strings.add("Test");

//        ArrayList

        System.out.println("size:"+strings.size());//结果无序
        for (String string : strings) {
            System.out.println(string);
        }
    }
}