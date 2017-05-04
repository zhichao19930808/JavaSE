package Exam;

import org.w3c.dom.css.Counter;
import sun.security.util.Length;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Exam_116 {
    /*
    输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。从后向前比较，以最短字符串为标准，输出不同的元素的个数。
例如:
输入：s1=”1,3,5” len1=3 s2=”2,4,1,7,5” len2=5
输出：1
     */

//    public static void main(String[] args) {
//        String s1 = "41222752";
//        String s2 = "141752";
//        System.out.println();
//        int len1 = s1.length();
//        int len2 = s2.length();
//        int x = 0;
//
//        if (len1 <= len2) {
//            for (int i = 0; i <len1; i++) {
//                if (s1.charAt(len1 - 1 - i) == s2.charAt(len2 - 1 - i)) {
//                    x++;
//                }
//        }
//    }else {
//            for (int j = 0; j < len2; j++) {
//                if (s1.charAt(len1 - 1 - j) == s2.charAt(len2 - 1 - j)) {
//                    x++;
//                }
//            }
//        }
//        System.out.println(x);
//    }


        private static int counter;

        public static void main(String[] args) {
            String s1 = "1,3,5,6,7,8";
            String s2 = "2,4,1,7,5";
            if (s1.length() > s2.length()) {
                String temp = s2; // temporary 临时的
                s2 = s1;
                s1 = temp;
            }
            String[] strings1 = s1.split(",");//split 分裂
            String[] strings2 = s2.split(",");//split 根据匹配给定的正则表达式来拆分此字符串。
            /*
            split
            根据匹配给定的正则表达式来拆分此字符串。
            此方法返回的数组包含此字符串的子字符串，每个子字符串都由另一个匹配给定表达式的子字符串终止，
            或者由此字符串末尾终止。数组中的子字符串按它们在此字符串中出现的顺序排列。
            如果表达式不匹配输入的任何部分，那么所得数组只具有一个元素，即此字符串。
            */
//            for (String s : strings1) {
//                for (String aStrings2 : strings2) {
//                    if (s2.contains(s)) {
//                        counter++;
//                    }
//                }
//            }
//            System.out.println(strings1.length - counter);
            for (int i = 0; i < strings1.length; i++) {
                if (strings1[strings1.length - 1 - i].equals(strings2[strings2.length - 1 - i])) {
                    counter++;
                }
            }
            System.out.println(strings1.length - counter);
        }
}