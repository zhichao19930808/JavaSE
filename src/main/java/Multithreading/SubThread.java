package Multithreading;

/**
 * Created by Administrator on 2017/5/8.
 * 创建新线程的第一种方法：将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法。
 */
//(1)将类声明为 Thread 的子类。
public class SubThread extends Thread {
    @Override
//(2)该子类应重写 Thread 类的 run 方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.start();
        System.out.println("test...");
    }
}
