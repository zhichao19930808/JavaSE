package Collection;

import java.util.*;

/**
 * Created by Administrator on 2017/4/12.
 */
public class ArraysTest {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "f", "d"};
        System.out.println(Arrays.toString(strings));
//binarySearch---使用二分搜索法来搜索指定类型数组，以获得指定的值。
        System.out.println(Arrays.binarySearch(strings, "c"));//binary adj. 二进位的；二元的；  search 搜寻;binarySearch(byte[] a, byte key)
//copyOf---复制指定的数组，截取或用 默认值 填充（如有必要），以使副本具有指定的长度。
        String[] strings1 = Arrays.copyOf(strings, 6);
        System.out.println(Arrays.toString(strings1));

//copyOfRange---将指定数组的指定范围复制到一个新数组
        System.out.println(Arrays.toString(Arrays.copyOfRange(strings, 1, 3)));

//sort--- 对指定 类型  数组按数字升序进行排序。
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


        LinkedHashSet<String> strings2 = new LinkedHashSet<>();
        strings2.add("a");
        strings2.add("1");
        strings2.add("c");


    }
}
