package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/12.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(3,"李四");
        map.put(2,"王五");
        map.put(4,"马六");
        map.put(null,"马六");
        map.put(6,null);//哈希表不能放空值，也不能放空key  hashMap可以

        System.out.println(map.size());
        for (Integer integer : map.keySet()) {
            System.out.println(integer+"/"+map.get(integer));
        }
        for (String s : map.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ">" + entry.getValue());
        }

    }
}
