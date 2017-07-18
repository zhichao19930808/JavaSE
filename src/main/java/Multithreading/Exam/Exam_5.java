package Multithreading.Exam;

/**
 * Created by Administrator on 2017/5/13.
 * 使用 wait 方法实现一次阻塞
 */
public class Exam_5 implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread (new Exam_5(), "0");
        Thread thread1 = new Thread(new Exam_5(), "1");
        Thread thread2 = new Thread(new Exam_5(), "2");
        Thread thread3 = new Thread(new Exam_5(), "3");
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.print(Thread.currentThread().getName());
        }
    }
}
