package Multithreading;


/**
 * Created by Administrator on 2017/5/9.
 * yield 让步
 */
public class YieldTest implements Runnable {
/*
yield
    public static void yield()
        暂停当前正在执行的线程对象，并执行其他线程。
 */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+":"+Thread.currentThread().getName());
            if (i % 10 == 0) {
                Thread.yield();//让步
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new YieldTest(),"thread1");
        Thread thread2 = new Thread(new YieldTest(),"thread2");
        thread1.start();
        thread2.start();
        System.out.println("test......");
    }
}
