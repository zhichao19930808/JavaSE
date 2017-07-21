package tcp_ip.Test_1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端连接成功后，和服务端say hello
 * 服务器收到客户端的say hello以后，会给客户一个say hello
 *
 *
 */
public class Sever {
    //指定要使用的端口
    public static final int PORT = 1025;
    //初始化
    public void inInti() {
        //告诉serSocket，客户端用上面端口号连接
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            //轮询
            //等待客户端连接
            System.out.println("服务器启动，等待客户端连接");
            while(true) {
                //accept()用于返回连接成功的客户端对象
                Socket client =serverSocket.accept();
                //当客户端成功连接之后，为每一个客户端开辟一个新的线程
                new SocketThread(client);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //内部类，最好是私有
//	一旦当客户链接以后，为每一个客户端的连接对象开辟一个虚拟的子线程
//	1，方便统计当前客户端的数量
//	2，让服务器不会被卡死
    private class SocketThread implements Runnable{

        //用客户端的连接对象来操作连接的客户端
        private Socket client = null;


        public SocketThread(Socket client) {
            //判断client是否是上一个客户端的客户端遗留的对象
            //
            if (this.client==null) {
                this.client=client;
            }
            new Thread(this).start();//可以在任意地方创建线程
        }
        @Override
        public void run() {
            // TODO Auto-generated method stub
            //处理消息
            //获取客户端床底给服务器的数据
            DataInputStream inputStream;
            try {
                inputStream = new DataInputStream(client.getInputStream());
                //服务端的read方法要和客户端的write方法保持一致
                String data = inputStream.readUTF();
                System.out.println("从客户端传送过来的信息：\n"+data);


                inputStream.close();
                client.close();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Sever demo = new Sever();
        demo.inInti();
    }

}
