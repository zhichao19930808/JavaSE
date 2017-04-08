package Collection;

/**
 * Created by Administrator on 2017/4/8.
 */
public class StringBufferTest {
    private static final String ONE_TWO_THREE = "123";

    // buffer 缓冲区
    public static void main(String[] args) {
//        String s = "hello";
//        StringBuffer stringBuffer = new StringBuffer(s);
//        String s1 = stringBuffer.toString();

        // append prepend 123123  123123
        String s = "";
        StringBuffer stringBuffer = new StringBuffer(); // "123"
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            s += ONE_TWO_THREE; // s = s + ONE_TWO_THREE
            stringBuffer.append(ONE_TWO_THREE);
        }
        System.out.println(System.currentTimeMillis() - start);
//        System.out.println(s.length()); // ?
        System.out.println(stringBuffer.length());
    }
}
