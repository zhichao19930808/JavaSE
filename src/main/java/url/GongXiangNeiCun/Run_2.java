package url.GongXiangNeiCun;

public class Run_2 implements Runnable {
    private Util util;

    public Run_2(Util util) {
        this.util = util;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                util.test2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
