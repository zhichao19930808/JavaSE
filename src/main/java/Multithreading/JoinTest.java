package Multithreading;

/**
 * Created by Administrator on 2017/5/8.
 * 线程中断
 */
public class JoinTest implements Runnable{
/*
join
public final void join()
                throws InterruptedException
        等待该线程终止。
        抛出：
            InterruptedException - 如果任何线程中断了当前线程。当抛出该异常时，当前线程的中断状态 被清除。
 */
    public static void main(String[] args) {
        Thread thread = new Thread(new JoinTest());
        thread.start();
        try {
            thread.join();// join 加入\ [dʒɒɪn]
        } catch (InterruptedException e) { // interrupt 中断\ [ɪntə'rʌpt]
            e.printStackTrace();
        }
        System.out.println("test...");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}
