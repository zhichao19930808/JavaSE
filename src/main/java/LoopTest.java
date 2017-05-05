import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/5/5.
 * 关于循环的一些练习
 */
public class LoopTest {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        System.out.println("---fori---");
        //fori循环，快捷键为itar  特点是可以随时取到索引值 i ；
        for (int i = 0; i < ints.length; i++) {
            if (i != 1) {
                System.out.println(ints[i]);
            }
        }
        System.out.println("---iter---");
        //iter 会自动对当前数组中的元素进行迭代，每次的值赋给anInt
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println("---list:fori---");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---list:iter---");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        //由于list实现了collection接口，collection接口上有个Iterable包，可以用一种特殊的循环叫迭代器循环
        //定义一个Iterable，里面放的类型是integer;Iterable = 当前list调用他的Iterable方法
        Iterator<Integer> integerIterator = list.iterator();
        System.out.println("---Iterable:itit---");
        //方法判断方式，如果有下一个就取得下一个
        while (integerIterator.hasNext()) {
            Integer next = integerIterator.next();
            System.out.println(next);
        }
    }
}
