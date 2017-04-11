package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/4/11.
 * 根据内部程序构造类型比较ArrayList和LinkList的运行速度哪个更快一些
 */
public class ArrayListLinkedListTime {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i + "");
            linkedList.add(i + "");
        }

        long time1 = System.currentTimeMillis();
        System.out.println(arrayList.remove(10000000 - 1));//分别尝试添加、删除、查找功能
        long time2 = System.currentTimeMillis();
        System.out.println(linkedList.remove(10000000 - 1));
        long time3 = System.currentTimeMillis();

        System.out.println("arrayList: " + (time2 - time1)); // arrayList
        System.out.println("linkedList: " + (time3 - time2)); // linkedList
    }
}
