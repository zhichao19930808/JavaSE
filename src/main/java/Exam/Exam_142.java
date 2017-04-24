package Exam;

/**
 * Created by Administrator on 2017/4/22.
 * 编写一个正确处理的产生空指针异常的程序
 */
public class Exam_142 {
    public static void main(String[] args) {
        String s = "空指针异常";
        s=null;
        try {
            System.out.println(s.toUpperCase());
        } catch (Exception e) {
            System.err.println("空指针异常");
        }
    }
}
