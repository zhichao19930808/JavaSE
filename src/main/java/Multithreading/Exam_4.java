package Multithreading;

/**
 * Created by Administrator on 2017/5/13.
 * 使用 join 方法实现一次阻塞
 */
public class Exam_4 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+".....");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Exam_4());
        thread1.setName("thread 1");
        Thread thread2 = new Thread(new Exam_4());
        thread1.setName("thread 2");
        Thread thread3 = new Thread(new Exam_4());
        thread1.setName("thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" * 使用 join 方法实现一次阻塞");
    }
}
