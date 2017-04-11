package Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/11.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");
        strings.add("Test");

//        ArrayList

        System.out.println("size:"+strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}