package Collection;

/**
 * Created by Administrator on 2017/4/8.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5, 6));// Ctrl + Q / Ctrl + J 查看文档
        System.out.println(stringBuffer.insert(5, ", ")); // offset 偏移量
        System.out.println(stringBuffer.insert(stringBuffer.length(), '!')); // offset 偏移量
        System.out.println(stringBuffer.reverse()); // 逆序
        stringBuffer.reverse().setCharAt(0, 'H');
        System.out.println(stringBuffer);
    }
}
