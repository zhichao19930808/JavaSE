package url.downLoadTest;

public class DownRun implements Runnable{
    private String address;
    private String file;

    public DownRun(String url, String file) {
        this.address = url;
        this.file = file;
    }

    @Override
    public void run() {
        Util.downLoad(address,file);
    }
}
