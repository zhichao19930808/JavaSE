package Exam;
import java.io.*;
import java.util.Random;
/**
 * Created by Administrator on 2017/4/22.
     编写一个程序实现以下功能:
    (1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
    (2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。
 */
public class Exam_144 {
    public static void main(String[] args) {
        //(1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
        Random random = new Random();//Random 此类的实例用于生成伪随机数流。
        int i;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"))) {

            for (int j = 0; j < 5000; j++) {
                i = random.nextInt(10000);
                while (i == 0) {
                    i=random.nextInt(10000);
                }
                bufferedWriter.write(String.valueOf(i));
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //(2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。
        try ( BufferedReader bufferedReader= new BufferedReader(new FileReader("a.txt"))){
            String line;
            //min  最小值    max  最大值
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            long sum = 0;//和

            while ((line = bufferedReader.readLine()) != null) {
                //把每行的字符串转换成整数存入到arrayList中，然后根据索引找出结果
                int x = 0;
                for (int j = 0; j < 5000; j++) {
                     x=Integer.parseInt(line);
                    if (x > max) {
                        max=x;
                    }
                    if (x < min) {
                        min=x;
                    }

                }
                sum+=x;
            }
            System.out.println("最大值为："+max+"\n"+"最小值为"+min+"\n"+"平均值为"+(sum/5000));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
