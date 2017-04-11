package Collection;

import java.util.TreeSet;

/**
 * Created by Administrator on 2017/4/11.
 */
public class TreeSetTest {
    /*
    * TreeSet:
    * 使用 红-黑 树 存储元素
    *按元素值排序
    * */
    public static void main(String[] args) {
        TreeSet<String>strings=new TreeSet<>();
        strings.add("d");
        strings.add("b");
        strings.add("a");
        strings.add("c");

        System.out.println(strings.size());

        for (String string : strings) {//a b c d
            System.out.println(string);
        }

    }
}
