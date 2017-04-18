package Exceptional;

/**
 * Created by Administrator on 2017/4/18.
 * CatchTest
 */
public class CatchTest {
    public static void main(String[] args) {
        try {//ctrl+alt+t
            System.out.println(1/0);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.err.println("算术异常");
        }
        System.out.println("test");
    }
}
