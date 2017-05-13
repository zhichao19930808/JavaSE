package Multithreading.Exam;

/**
 * Created by Administrator on 2017/5/13.
 * 使用 Thread 类实现多线程
 */
public class Exam_1 extends Thread {
    @Override
    public void run() {
        System.out.println("----------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Exam_1 exam1 = new Exam_1();
        exam1.start();
        System.out.println(" * 使用 Thread 类实现多线程");
    }
}
