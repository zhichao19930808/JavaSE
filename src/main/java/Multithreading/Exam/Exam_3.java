package Multithreading.Exam;

/**
 * Created by Administrator on 2017/5/13.
 *  使用 sleep 方法实现一次阻塞
 */
public class Exam_3 implements Runnable{
    @Override
    public void run() {
        System.out.println("----使用 sleep 方法实现一次阻塞----");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "\t"+i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Exam_3());
        thread.setName("thread 1");
        Thread thread2 = new Thread(new Exam_3());
        thread2.setName("thread 2");
        Thread thread3 = new Thread(new Exam_3());
        thread3.setName("thread 3");
        thread.start();
        thread2.start();
        thread3.start();

    }
}
