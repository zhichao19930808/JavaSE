package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/12.
 */
public class E2 {
    /*
    使用 Map 接口的实现类完成员工工资(姓名→工资)的摸拟：
添加几条信息
列出所有的员工姓名
列出所有员工姓名及其工资
删除名叫 Tom 的员工信息
输出 Jack 的工资，并将其工资改为 1500 元
将所有工资低于 1000 元的员工的工资上涨 20%
     */
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //添加几条信息
        map.put("tom",1000);
        map.put("jack",1100);
        map.put("xiaoming",2000);
        map.put("baojie",600);
        map.put("baoan",800);

        //列出所有的员工姓名
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        System.out.println("****************************");
        //列出所有员工姓名及其工资
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }
        System.out.println("********************************");
        //删除名叫 Tom 的员工信息
        map.remove("tom");
        System.out.println("删除了名叫 Tom 的员工信息");
        System.out.println("********************************");
        // 输出 Jack 的工资，并将其工资改为 1500 元
        for (String s : map.keySet()) {
            if (s.equals("jack")) {
                System.out.println(s+"的工资是："+map.get(s));
                map.put(s,1500);
                System.out.println(s+"的工资改为："+map.get(s));
            }
        }
       //将所有工资低于 1000 元的员工的工资上涨 20%
        System.out.println("*********************************");
        System.out.println("将所有工资低于 1000 元的员工的工资上涨 20%");
        for (String s : map.keySet()) {
            if (map.get(s) < 1000) {
                map.put(s,(int)(map.get(s)*1.2));
            }
        }
        System.out.println(map);
    }
}
