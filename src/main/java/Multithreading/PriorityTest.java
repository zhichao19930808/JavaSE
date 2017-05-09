package Multithreading;

/**
 * Created by Administrator on 2017/5/9.
 * priority 优先级
 */
public class PriorityTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"的优先级是："+Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new PriorityTest(), "thread 1");
        Thread thread2 = new Thread(new PriorityTest(), "thread 2");
        Thread thread3 = new Thread(new PriorityTest(), "thread 3");
        thread1.setPriority(Thread.MIN_PRIORITY);//1
        thread2.setPriority(Thread.NORM_PRIORITY);//5
        thread3.setPriority(Thread.MAX_PRIORITY);//10
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
