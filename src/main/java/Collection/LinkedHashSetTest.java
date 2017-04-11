package Collection;

import java.util.LinkedHashSet;

/**
 * Created by Administrator on 2017/4/11.
 */
public class LinkedHashSetTest {
    /*
    * LinkedHashSet:
    * 使用 HashMap 实现
    * 按元素添加顺序排序*/
    public static void main(String[] args) {
    LinkedHashSet<String>strings=new LinkedHashSet<>();
    strings.add("a");
    strings.add("b");
    strings.add("d");
    strings.add("c");

        System.out.println("size:"+strings.size());//a b d c
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
