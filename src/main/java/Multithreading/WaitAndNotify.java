package Multithreading;

/**
 * Created by Administrator on 2017/5/14.
 * wait  [weɪt]n. 等待；等候
 * notify ['nəʊtɪfaɪ]  通知；报告；通告
 */
 class WaitAndNotify {

    synchronized void waitTest() {//synchronized['sɪŋkrənaɪzd]  同步的;动词synchronize的过去式和过去分词.
        System.out.println(Thread.currentThread().getName()+" is start to wait");//current 现在的
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" is end to wait");
    }

    synchronized void notifyTest() {
        System.out.println(Thread.currentThread().getName()+" is start to notify");
        this.notify();
        System.out.println(Thread.currentThread().getName()+" is end to notify");
    }
    synchronized void notifyAllTest() {
        System.out.println(Thread.currentThread().getName()+" is start to notifyAll");
        this.notifyAll();
        System.out.println(Thread.currentThread().getName()+" is end to notifyAll");
    }
}


class WaitTest implements Runnable{
    private static WaitAndNotify hehe = new WaitAndNotify();
    @Override
    public void run() {
        if (Thread.currentThread().getName().endsWith("3")) {
            hehe.notifyAllTest();
            return;
        }
        hehe.waitTest();
    }

    public static void main(String[] args) {
        WaitTest waitTest = new WaitTest();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(waitTest,"thread "+i);
            thread.start();
        }
    }
}


