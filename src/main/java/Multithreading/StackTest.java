package Multithreading;

import java.util.Stack;

/**
 * Created by Administrator on 2017/5/14.
 *  stack 堆栈\ [stæk] LIFO Last In First Out
 *  queue 队列\ [kjuː] FIFO First In Fist Out
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("hello");
        stack.push("test");
        stack.push("hi");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
