package Multithreading;

/**
 * Created by Administrator on 2017/5/10.
 * synchronized 同步的
 */
 class Account {//Account  [ə'kaʊnt]  账户；帐目；赊账
    private int money;

     Account(int money) {
        this.money = money;
    }

     synchronized void withdraw(int num) {//withdraw [wɪð'drɔː] 提款
        if (money >= num) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money-=num;
            System.out.println("取出" + num + "元");
        } else {
            System.out.println("账户余额不足");
        }
    }
     int getMoney() {
        return money;
    }
}
class Person  implements Runnable {
    private static Account account =new Account(1000);
    @Override
    public void run() {
        account.withdraw(1000);
    }

    public static void main(String[] args) {
        Thread boy = new Thread(new Person (),"boy");
        Thread girl = new Thread(new Person(),"girl");

        boy.start();
        girl.start();

        try {
            boy.join();
            girl.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("账户余额："+account.getMoney());
    }
}