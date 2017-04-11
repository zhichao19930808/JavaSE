package Collection;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/4/11.
 */
public class LinkedListTest {
    //link 链接\ [lɪŋk]
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("hi");
        strings.add("hello");

        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println("-------------------------------");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("--------------------------------");
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}
