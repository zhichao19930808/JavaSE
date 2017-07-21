package tcp_ip.test_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever2 {
    public static void main(String[] args) {
        Sever2 sever2 = new Sever2();
        sever2.inInti();
    }
    //端口
    private static  final int PORT = 1026;

    //初始化
    private void inInti() {
        try {
            //设置服务器的端口
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("设置成功，等待客户端连接");
            //设置一个死循环，来不停的接受客户端的连接
            while (true) {
                //创建一个客户端=成功连接的客户端
                Socket client = serverSocket.accept();
                //为新连接的客户端开辟一个新的线程
                new SocketThread(client);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
