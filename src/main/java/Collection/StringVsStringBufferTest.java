package Collection;

/**
 * Created by Administrator on 2017/4/10.
 */
public class StringVsStringBufferTest {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // alphabet 字母\ ['ælfəbet]

    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();//currentTimeMillis   返回以毫秒为单位的当前时间。
                                               // 注意，当返回值的时间单位是毫秒时，值的粒度取决于底层操作系统，并且粒度可能更大。
                                              // 例如，许多操作系统以几十毫秒为单位测量时间。
        for (int i = 0; i < 10000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        System.out.println("time: " + (System.currentTimeMillis() - start));
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}