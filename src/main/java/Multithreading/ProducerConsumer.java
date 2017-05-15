package Multithreading;

import java.util.Stack;

/**
 * Created by Administrator on 2017/5/15.
 *  Producer[prə'djuːsə(r)]生产者
 *  Consumer[kən'sjuːmə]消费者
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Thread producer1 = new Thread(new producer(stack), "push1:");
        Thread consumer1 = new Thread(new consumer(stack), "pop1:");
        Thread producer2 = new Thread(new producer(stack), "push2:");
        Thread consumer2 = new Thread(new consumer(stack), "pop2:");

        producer1.start();
        consumer1.start();
        producer2.start();
        consumer2.start();
    }
}

class producer implements Runnable{
    private static final int MAX = 3;
    private  Stack<Integer> stack;
    private static int date;

    public producer(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        synchronized (stack) {
            while (true){
                if (stack.size() == MAX) {
                    try {
                        stack.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return;
                } else {
                    System.out.println(Thread.currentThread().getName()+" produce "+stack.push(date++));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stack.notify();
            }
        }
    }
}

class consumer implements Runnable {
    private Stack<Integer> stack;

    public consumer(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        synchronized (stack) {
            while (true) {
                if (stack.isEmpty()) {
                    try {
                        stack.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return;
                } else {
                    System.out.println(Thread.currentThread().getName()+" consume "+stack.pop());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                stack.notify();
            }
        }

    }
}