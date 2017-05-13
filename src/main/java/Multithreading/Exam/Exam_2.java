package Multithreading.Exam;

/**
 * Created by Administrator on 2017/5/13.
 * 2.  使用 Runnable 接口实现多线程 10分
 */
public class Exam_2 implements Runnable{
    @Override
    public void run() {
        System.out.println("------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Exam_2());
        Thread thread1 = new Thread(new Exam_2());
        Thread thread2 = new Thread(new Exam_2());
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("Exam_2...");
    }
}
