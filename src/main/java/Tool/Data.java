package Tool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2017/5/12.
 * 对抓取的信息进行简单的分析
 */
public class Data {
    /*
    1.将test类中抓取的地区拼音名托到本页中
    2.使用正则的方式将空格去掉，并为其前后加上双引号，末尾加逗号，去掉最后一个逗号；
    3.将其赋值给 fileName 常量数组；
    4.读取字符串数组中对应LianJia文件夹下的目录，并计算总数
    5.将其存入至HashSet表中（去除掉重复房源），并计算总数
    6.由于怀柔没有在售房源，此处对其进行积极处理（catch一下）
    7.由于怀柔没有在售房源，手动将index.html文件中的怀柔删除；
    准备工作就绪，开始对数据进行分析
    1.将Set的中的数据存入到arrayList中，使用工具类Collections.sort(list);对list进行排序；
    2.找到最大值，最小值，平均值

     */
    private static final String[] fileNames = {
            "beiJingdongcheng",
            "beiJingxicheng",
            "beiJingchaoyang",
            "beiJinghaidian",
            "beiJingfengtai",
            "beiJingshijingshan",
            "beiJingtongzhou",
            "beiJingchangping",
            "beiJingdaxing",
            "beiJingyizhuangkaifaqu",
            "beiJingshunyi",
            "beiJingfangshan",
            "beiJingmentougou",
            "beiJingpinggu",
            "beiJinghuairou",
            "beiJingmiyun",
            "beiJingyanqing",
            "beiJingyanjiao"
    };
    private static final String PATH = "LianJia/";
    private static int counter;
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        List<Double> list = new ArrayList<>();
        for (String fileName : fileNames) {
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(PATH.concat(fileName)))//concat 将指定字符串连接到此字符串的结尾。
            ) {
                String line;
                while ((line = reader.readLine()) != null) {
//                    System.out.println(line);
                    set.add(line);
                    counter++;
                }

                for (String s : set) {
                    list.add(Double.parseDouble(s.split("#")[4]));
                }
                Collections.sort(list);
                System.out.println("---总价：---");
                System.out.println(fileName+" min:"+list.get(0));
                System.out.println(fileName+" max:"+list.get(list.size()-1));

                Double sum = 0d;
                for (Double aDouble : list) {
                    sum += aDouble;
                }
                System.out.println(fileName+" avg:"+sum/list.get(0));
            }catch (FileNotFoundException e) {
                System.err.println(fileName+"未找到");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数量"+counter);
    }
}
