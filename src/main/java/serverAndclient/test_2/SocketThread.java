package serverAndclient.test_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketThread implements Runnable{
    private Socket client;

    public SocketThread(Socket client) {
        //判断，如果不是上一个客户端遗留的对象就将用户的client赋给client，否则直接执行下一步
        if (this.client == null) {
            this.client = client;
        }
        //为client启动一个线程
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println(client+"连接服务器");
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            String userData ;
            String serverData;

            do {
                //接收客户端的输入的信息
                userData = inputStream.readUTF();
                System.out.println("客户：" + userData);
                if (userData.equals("再见")) {
                    System.out.println("客户端已断开连接");
                    break;
                }
                //给客户返回信息
                System.out.println("请输入信息：");
                serverData = scanner.nextLine();
                outputStream.writeUTF(serverData);
            } while (true);

            inputStream.close();
            outputStream.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
