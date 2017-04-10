package Collection;

import com.sun.javafx.image.impl.IntArgb;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/10.
 */
public class HashtableTest {// hashtable 散列表
    public static void main (String[]args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();// K - key 键 V - value 值  K -> V
        hashtable.put(1,"haha");//--------------------------------put 放；安置；使处于；提交；记下；表达；出发；开航
        hashtable.put(2,"heihei");
        hashtable.put(3,"lala");
        System.out.println(hashtable.size());//-------------------size 大小；规模；尺寸；尺码；浆料；胶料
        System.out.println(hashtable.get(1));//-------------------get 得到；使得；抓住；克服；明白；激怒；患（病）；达到
        for (Integer integer : hashtable.keySet()) {//------------key 键； 循环输出所有的键
            System.out.println(integer+"、"+hashtable.get(integer));
        }
        hashtable.remove(2);//------------------------------remove 消除;
        System.out.println(hashtable.clone());//------------------clone 克隆；复制;  输出全部
        System.out.println(hashtable.toString());//---------------效果同克隆
        System.out.println(hashtable.containsKey(5));//-----contains 包含；  查询是否包含某键，返回true或false；
        System.out.println(hashtable.containsValue("haha"));//-----contains 包含；  查询是否包含某值，返回true或false；
        System.out.println(hashtable.contains("haha"));//-----contains 包含； 效果同containsValue；查询是否包含某值，返回true或false；推荐使用containsValue,因为containsValue更准确。
        for (String s : hashtable.values()) {//-------------------value 值；  循环输出所有的值
            System.out.println(s);
        }

    }
}
