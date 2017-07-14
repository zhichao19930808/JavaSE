package Thread;

/**
 * Created by Administrator on 2017/7/14.
 */
public class ThreadTest implements Runnable{
    public static void main(String[] args){
        System.out.println("主线程开始:"+Thread.currentThread().getName()+"\tid:"+Thread.currentThread().getId());


        Thread thread = new Thread(new ThreadTest(),"张三");
        thread.start();
        try {
            thread.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束:"+Thread.currentThread().getName()+"\tid:"+Thread.currentThread().getId());
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程："+Thread.currentThread().getName()+"\tid:"+Thread.currentThread().getId()+"\t循环次数："+(i+1));
        }
    }
}
