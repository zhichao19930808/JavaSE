package Collection;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Created by Administrator on 2017/4/12.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"你");
        map.put(11,"我");
        map.put(-1,"他");

        System.out.println(map.size());
        System.out.println(map.get(-1));

        for (Integer integer : map.keySet()) {
            System.out.println(integer+"、"+map.get(integer));
        }

    }
}
