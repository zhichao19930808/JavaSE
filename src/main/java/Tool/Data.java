package Tool;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/5/12.
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
    1.将Set的泛型变为Double类型，使用字符串“#”拆分line字符串，并使用parse方法将其转化为double类型，add到set中；

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
                    set.add(line);
                    counter++;
                }
                for (String s : set) {
                    list.add(Double.parseDouble(s.split("#")[5]));
                }
            }catch (FileNotFoundException e) {
                System.err.println(fileName+"未找到");
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
        System.out.println("counter"+counter);
        System.out.println(set.size());
        /*
        结果：
        beiJinghuairou未找到
        counter26343
        20701
         */
    }
}
