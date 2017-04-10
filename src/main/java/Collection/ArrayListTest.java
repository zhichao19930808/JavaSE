package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/10.
 * arrayListTest
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings =new ArrayList<>();
        System.out.println("（add）------------------------------------------------------------------------------------------");
        strings.add("hi");//add 加；将指定的元素添加到此列表的尾部。
        strings.add("hello");
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings);
        System.out.println("（add）------------------------------------------------------------------------------------------");
        strings.add(1,"插队啦");//将指定的元素插入此列表中的指定位置
        System.out.println(strings);
        System.out.println("（addAll）------------------------------------------------------------------------------------------");
        strings.addAll(0,strings);//从指定的位置开始，将指定 collection 中的所有元素插入到此列表中。
        System.out.println(strings);
        System.out.println("（clear）------------------------------------------------------------------------------------------");
        strings.clear();//移除此列表中的所有元素。
        System.out.println(strings);
        strings.add("hello");
        strings.add("hi1");
        strings.add("hi2");
        System.out.println("（size）------------------------------------------------------------------------------------------");
        System.out.println(strings.size());//返回此列表中的元素数
        System.out.println("（get)------------------------------------------------------------------------------------------");
        System.out.println(strings.get(1));//返回此列表中指定位置上的元素。
        System.out.println("(iter)---------------------------------------------------------------------------------------");
        for (String string : strings) {//循环输出所有的元素
            System.out.println(string);
        }
        System.out.println("(contains)---------------------------------------------------------------------------------------");
        System.out.println(strings.contains("hi1"));//如果此列表中包含指定的元素，则返回 true。
        System.out.println("(containsAll)---------------------------------------------------------------------------------------");
        System.out.println(strings.containsAll(strings));//如果此 collection 包含指定 collection 中的所有元素，则返回 true
        System.out.println("indexOf---------------------------------------------------------------------------------------------");
        System.out.println(strings.indexOf("test1"));// 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
        System.out.println("isEmpty-----------------------------------------------------------------------------------------------");
        System.out.println(strings.isEmpty());//如果此列表中没有元素，则返回 true
        System.out.println("lastOf---------------------------------------------------------------------------------------------");
        System.out.println(strings.lastIndexOf("test1"));// 返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。

    }
}
