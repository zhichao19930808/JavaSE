package Exam;

import sun.security.util.Length;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Exam116 {
    /*
    输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。从后向前比较，以最短字符串为标准，输出不同的元素的个数。
例如:
输入：s1=”1,3,5” len1=3 s2=”2,4,1,7,5” len2=5
输出：1
     */

    public static void main(String[] args) {
        String s1 = "41222752";
        String s2 = "141752";
        System.out.println();
        int len1 = s1.length();
        int len2 = s2.length();
        int x = 0;

        if (len1 <= len2) {
            for (int i = 0; i <len1; i++) {
                if (s1.charAt(len1 - 1 - i) == s2.charAt(len2 - 1 - i)) {
                    x++;
                }
        }
    }else {
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(len1 - 1 - j) == s2.charAt(len2 - 1 - j)) {
                    x++;
                }
            }
        }
        System.out.println(x);
    }

}