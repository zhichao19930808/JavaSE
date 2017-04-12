package Collection;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/4/12.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();//有序，索引
        list.add("aa");
        list.add("ab");
        list.add("ac");

        Iterator<String>iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("***********************************************");
        TreeSet<String>set = new TreeSet<>();
        set.add("aa");
        set.add("ab");
        set.add("ac");

        Iterator<String>iterator1=set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("*************************************************");
        HashMap<Integer,String>map = new HashMap<>();
        map.put(1,"aa");
        map.put(2,"ab");
        map.put(3,"ac");

        Iterator<Integer>iterator2 = map.keySet().iterator();
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//        }
        while (iterator2.hasNext()) {
            int key = iterator2.next();
            System.out.println(key+"、"+map.get(key));
        }
    }
}
