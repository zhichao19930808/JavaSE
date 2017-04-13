package generic;

import Collection.E1;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/13.
 */
public class Test<T> {
    private String concat(T x,T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(11,11));
        System.out.println(test.concat(new Date(),new Date()));
        System.out.println(test.concat(1.3,32.2));
    }
}
