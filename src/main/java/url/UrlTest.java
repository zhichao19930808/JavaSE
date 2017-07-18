package url;

public class UrlTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new DownRun("",""));
        thread.start();
        Thread thread1 = new Thread(new DownRun("",""));
        thread1.start();
    }
}
