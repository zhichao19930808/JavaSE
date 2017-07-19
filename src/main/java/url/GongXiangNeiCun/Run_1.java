package url.GongXiangNeiCun;

public class Run_1 implements Runnable {
    private Util util;

    public Run_1(Util util) {
        this.util = util;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                util.test1();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
