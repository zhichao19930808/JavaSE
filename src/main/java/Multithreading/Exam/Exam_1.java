package Multithreading.Exam;

/**
 * Created by Administrator on 2017/5/13.
 * 1. 使用 Thread 类实现多线程 10分
 */
public class Exam_1 implements Runnable{
    @Override
    public void run() {
        System.out.println("------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Exam_1());
        Thread thread1 = new Thread(new Exam_1());
        Thread thread2 = new Thread(new Exam_1());
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("Exam_1...");
    }
}
