package generic;

import java.util.Vector;

/**
 * Created by Administrator on 2017/4/13.
 */
public class VectorTest {
    public static void main(String[] args) {
        /*
        Vector vector = new Vector();//兼容
        vector.add("qq");
        vector.add("oo");
        vector.add("22");
        vector.add(23);

        String s =(String) vector.get(3);
        System.out.println(s);
        */
        //如果没有加入泛型，可能会在强转时出现 ClassCastException
        //加入泛型可以：进行类型安全，附加了类型检查。避免强制类型转换时出现 ClassCastException
        Vector<String>vector = new Vector<>();
        vector.add("22");
        vector.add("23");
        String s =vector.get(1);
        System.out.println(s);
    }
}
