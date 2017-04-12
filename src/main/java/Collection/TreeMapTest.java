package Collection;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/4/12.
 */
public class TreeMapTest {
    public static void main(String[] args) {

        TreeMap<String,Integer>map = new TreeMap<>();
        map.put("ha",1);
        map.put("haaa",1);
        map.put("haa",1);

        System.out.println(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"、"+entry.getValue());        }
    }
}
/*
k-v

hashtable 键和值不能为空
hashmap 键和值都能为空
linkedmap 键和值都能为空
treeMap 值可为空，键不能为空
*/