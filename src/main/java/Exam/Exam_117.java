package Exam;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/15.
 * 找出字符串中出现次数最多的字母和出现的次数
 */
public class Exam_117 {
    /*
    找出字符串中出现次数最多的字母和出现的次数
     */
    public static void main(String[] args) {
        String s="efweuhfleeeeewehflwklnlqkn";

        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashtable.put(c, hashtable.get(c) == null ? 1 : hashtable.get(c) + 1);
        }

        int max = Collections.max(hashtable.values());

        System.out.println(max);

        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
            if (max == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
        /*
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
            System.out.println(s.charAt(a)+"出现次数最多"+"出现了"+x+"次");*/
    }
}
