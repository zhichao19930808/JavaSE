package Multithreading;

/**
 * Created by Administrator on 2017/5/8.
 * join test
 */
public class JoinTest2 implements Runnable{
    /*
join
public final void join()
                throws InterruptedException
        等待该线程终止。
        抛出：
            InterruptedException - 如果任何线程中断了当前线程。当抛出该异常时，当前线程的中断状态 被清除。
     */
    /*
    currentThread
            public static Thread currentThread()
       返回对当前正在执行的线程对象的引用。
       返回：
            当前执行的线程。
     */
    /*
    sleep
public static void sleep(long millis)
                  throws InterruptedException
                  在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），
            此操作受到系统计时器和调度程序精度和准确性的影响。该线程不丢失任何监视器的所属权。
                    参数：
            millis - 以毫秒为单位的休眠时间。
                    抛出：
            InterruptedException - 如果任何线程中断了当前线程。当抛出该异常时，当前线程的中断状态 被清除。
                    另请参见：
             Object.notify()
     */
    public static void main(String[] args) {
        Thread thread1 = new Thread(new JoinTest2());
        thread1.setName("thread1");
        Thread thread2 = new Thread(new JoinTest2());
        thread1.setName("thread2");
        Thread thread3 = new Thread(new JoinTest2());
        thread1.setName("thread3");

        thread1.start();
        thread2.start();
        try {
            thread2.join();//等待该线程终止。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test...");
        thread3.start();

    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"is running...");//currentThread 返回对当前正在执行的线程对象的引用。
            try {
                Thread.sleep(1000);//sleep 在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
