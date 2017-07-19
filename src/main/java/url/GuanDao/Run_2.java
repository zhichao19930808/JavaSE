package url.GuanDao;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run_2 implements Runnable {
    private PipedInputStream inputStream;

    public Run_2(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }
    /**
     * 通信的管道一旦建立
     * 管道的容量是1024字节的长度，只要被读过，管道中的数据就会被清空
     * 读取的时候用于存放数据的数组的长度要>=1024
     */
    @Override
    public void run() {
        try {
            System.out.println("Run_2:两秒后将接受到Run_2的数据");
            byte bytes[] = new byte[1024];
            int count = inputStream.read(bytes);
            StringBuilder s = new StringBuilder();
            for (byte aByte : bytes) {
                //将管道中的内容进行读取，并进行转换
                //如果是中文，再进行write()的时候，就会变成乱码
                s.append((char) aByte);
            }

            int a = Integer.parseInt(s.toString().trim());
            if (a == -1) {
                System.out.println("连接成功");
            } else if (a == 0) {
                System.out.println("开始下载");
            } else if (a > 0 && a < 100) {
                System.out.println("下载中");
            } else if (a == 100) {
                System.out.println("下载完毕");
            } else {
                System.out.println("未知异常！！！");
            }

            System.out.println("接受到Run_1传送来的数据为："+s.toString().trim());
            System.out.println("0.0");
            if (count == -1) {
                inputStream.close();
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
