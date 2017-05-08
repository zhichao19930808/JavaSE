package Multithreading;

/**
 * Created by Administrator on 2017/5/8.
 * 创建线程的另一种方法是声明实现 Runnable 接口的类。该类然后实现 run 方法。
 * 然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动。采用这种风格的同一个例子如下所示：
 */
public class Test implements Runnable{//(1)声明实现 Runnable 接口的类
    @Override
    public void run() {//(2)然后实现 run 方法。
        for (int i = 0; i <10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();//(3)分配该类的实例
        //创建新执行线程有两种方法。一种方法是将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法。
        Thread thread = new Thread(test);//(4)在创建 Thread 时作为一个参数来传递并启动。
        thread.start();//使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
        System.out.println("test...");
    }
//    cpu在某个时刻只能运行一个进程中的一个线程
    // 进程 process 过程\ ['prəʊses]
    // 线程 thread 线程\ [θred]
    /*
    线程 是程序中的执行线程。Java 虚拟机允许应用程序并发地运行多个执行线程。
    */
     /*
        start
            public void start()使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
            结果是两个线程并发地运行；当前线程（从调用返回给 start 方法）和另一个线程（执行其 run 方法）。
            多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
            抛出：
            IllegalThreadStateException - 如果线程已经启动。
         */

}
