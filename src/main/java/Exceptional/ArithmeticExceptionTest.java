package Exceptional;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2017/5/2.
    1. 写个循环，循环100次，每次随机产生两个0-9的整数，然后计算两个数的商并输出结果，比如： 3/2=1
    2.通过try catch语句对异常进行处理
    3.程序最好在发生了异常之后还能继续运行，保证循环100次
    循环10次
 */
public class ArithmeticExceptionTest {
    public static void main(String[] args) {
//        1. 写个循环，循环100次，每次随机产生两个0-9的整数，并将数字存入ArrayList中；
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();//Random 此类的实例用于生成伪随机数流。
        for (int i = 0; i < 100; i++) {
            int x =random.nextInt(10);
            arrayList.add(x);
        }
//        2.计算两个数的商并输出结果，比如3/2=1(由于题意不明确，此处将循环计算所有数相除的商)
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
//        3.程序最好在发生了异常之后还能继续运行
                try {
                    int y = arrayList.get(i) / arrayList.get(j);
                    System.out.println(arrayList.get(i) + "/" + arrayList.get(j) + "=" + y);
                } catch (ArithmeticException e) {//明显可以看出此处发生的异常应该是除数为0，所以是算术异常
                    System.err.println("算术异常");
                }
            }
        }
    }
}
