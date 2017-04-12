package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017/4/12.
 */
public class LinsteltratorTest {
    public static void main(String[] args) {
        ArrayList<String>strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        ListIterator<String> listIterator =strings.listIterator();//
        //next
        while (listIterator.hasNext()) {
            String next = listIterator.next();
        //index
            System.out.print(listIterator.nextIndex()+"\t");
            System.out.println(next);
        }
        System.out.println("*******************************************");
        //prev
        while (listIterator.hasPrevious()) {
            String prev =  listIterator.previous();
            System.out.println(prev);
        //set
            listIterator.set("o");
        //remove
            listIterator.remove();
        }
        //add
        listIterator.add("f");
        System.out.println(strings.clone());//结果成功添加了字符串，且字符串在第一个位置。[f, a, b, c, d, e]

    }
}
