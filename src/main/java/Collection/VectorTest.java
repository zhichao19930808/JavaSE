package Collection;

import java.util.Vector;

/**
 * Created by Administrator on 2017/4/8.
 * 向量；矢量
 */
public class VectorTest {
    public static void main(String[] args) {
        //vector 向量；矢量
        Vector<String> strings = new Vector<>(); // E element 元素
        for (int i = 0; i < 10; i++) {
            strings.add("hi");
        }
        strings.clear();//
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println(strings.capacity()); // capacity 容量


    }
}
