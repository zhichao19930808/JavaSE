package OOP;

/**
 * Created by Administrator on 2017/4/7.
 * 参数传递方式
 */
public class ParameterPassTest {
    private static void text(int j) {
        System.out.println("b:"+j);
       j++;
        System.out.println("c:"+j);
    }

    public static void main(String[] args) {
        int i = 9;
        System.out.println("a:"+i);
        text(i);
        System.out.println("d:"+i);

        /*
        * 参数传递方式
        * 值传递
            * 传递参数的值
            * 方法的参数是基本数据类型 primitives
            * 方法中的改变不影响实际参数 references

         */
    }
}
