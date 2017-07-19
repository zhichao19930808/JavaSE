package url.GongXiangNeiCun;

public class Test {
    public static void main(String[] args) {
        Util util1 = new Util();

        Util util2 = new Util();
        Thread thread1 = new Thread(new Run_1(util1));
        Thread thread2 = new Thread(new Run_2(util2));

        thread1.start();
        thread2.start();
    }
}
