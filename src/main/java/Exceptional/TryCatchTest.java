package Exceptional;

/**
 * Created by Administrator on 2017/4/17.
 * 异常处理
 */
public class TryCatchTest {
    public static void main(String[] args) {
        try {
            System.out.println("hello".charAt(5));//字符串下标越界 java.lang.StringIndexOutOfBoundsException

            System.out.println(new int[]{1, 3, 2}[3]);//数组下标越界 ArrayIndexOutOfBoundsException

            System.out.println(1 / 0); //算术异常 java.lang.ArithmeticException

            System.out.println(Integer.valueOf("l23"));//数字格式化异常  java.lang.NumberFormatException

            String s = "hi";
            //若干行后
            s = null;
            //再若干行后
            System.out.println(s.toUpperCase());//空指针异常 java.lang.NullPointerException
        } catch (StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("字符串下标越界 java.lang.StringIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界 ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("算术异常 java.lang.ArithmeticException");
        } catch (NumberFormatException e) {
            System.out.println("数字格式化异常  java.lang.NumberFormatException");
        } catch (NullPointerException e) {
            System.out.println("空指针异常 java.lang.NullPointerException");
        }finally {
            System.out.println("异常处理");
        }
        System.out.println("try 内一旦发生异常，try 内这条语句后的代码都不再执行，无论异常有没有被 catch’\nfinally 语句块总是会被执行\ntry外的程序还可以运行");



        //try 尝试     catch 捕捉；捕获    finally 最后的；
        /*
        异常的处理
        ------------
try {
  // 可能产生异常的语句块
} catch (ExceptionType exceptionType) {
  // 异常的处理
} finally {
  // 其他的处理
}
----------------------------------------------------------
try 后面必须有 catch 或 finally
catch 可以有多个
finally 最多只能有一个
finally 位于 catch 的后面
try 内一旦发生异常，try 内这条语句后的代码都不再执行，无论异常有没有被 catch
finally 语句块总是会被执行
异常的处理方式n
输出异常信息 e.pritStackTrace();
退出程序 System.exit(1)
针对特定异常的更积极的处理方式
         */
    }
}
