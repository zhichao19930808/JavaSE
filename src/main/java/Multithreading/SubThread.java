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
//        subThread.run();
        subThread.start();
        System.out.println("test...");
    }
}
/*
Thread lifecycle

新建 New
就绪 Runnable
运行 Running
阻塞 Blocked
等待阻塞 Waiting
同步阻塞 Blocked on synchronization
其他阻塞
I/O
Sleep
Join
死亡 Dead
 */