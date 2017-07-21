package tcp_ip.Test_1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    //要连接的服务端的端口是多少
    private static final int PORT = 1025;
    //IP
    //本地ip：localhost或127.0.0.1
    private static final String IP_ADDRESS="localhost";

    public void connctionServer() {

        try {
            //连接服务器
            System.out.println("客户端上线，连接服务器");
            Socket client = new Socket(IP_ADDRESS, PORT);
            System.out.println("连接服务器成功");
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入你想对服务器说的话：");
            String data = scanner.nextLine();
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            outputStream.writeUTF(data);
            outputStream.close();
            client.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Client demo = new Client();
        demo.connctionServer();
    }

}