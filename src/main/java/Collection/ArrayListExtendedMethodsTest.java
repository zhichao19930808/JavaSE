package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11.
 */
public class ArrayListExtendedMethodsTest {
    public static void main(String[] args) {
        List<String>strings1=new ArrayList<>();
        strings1.add("hello");
        strings1.add("hi");

        List<String>strings2=new ArrayList<>();
        strings2.add("hi");
        strings2.add("hello");

        System.out.println(strings1.equals(strings2));//equals 确定指定的对象是否等于此 AlphaComposite;本体虽然所含元素一致，但顺序不同，所以返回false;

        List<String>strings3=strings1.subList(0,1);//sublist 返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。
        System.out.println(strings3);

        System.out.println(strings1.containsAll(strings2));//containsAll  测试以查看指定 Collection 中的所有对象是否是此 BeanContext 的子对象。

        System.out.println(strings1.removeAll(strings3));//removeAll 从此列表移除所有包含在指定 collection 中的元素。在此类中，这是一个开销很大的操作，因为它需要一个内部临时数组。


       strings2.retainAll(strings1);//retainAll  仅保留指定子对象（不受支持的）实现，这些实现在层次结构锁定和 "children" 受保护字段上必须是同步的
        System.out.println(strings2);
    }
}
