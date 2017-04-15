package Exam;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Exam_117 {
    /*
    找出字符串中出现次数最多的字母和出现的次数
     */
    public static void main(String[] args) {
        int a=0;
        int x=0;
        String s="efweuhfleeeeewehflwklnlqkn";
        for (int i = 0; i < s.length(); i++) {
            int y=0;
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    y++;
                    }
            }
            if (y >= x) {
                x=y;
                a=i;
            }
            }
            System.out.println(s.charAt(a)+"出现次数最多"+"出现了"+x+"次");
    }
}
