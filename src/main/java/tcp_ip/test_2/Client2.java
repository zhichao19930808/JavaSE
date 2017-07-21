package tcp_ip.test_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    //端口号
    private static final int PORT = 1026;
    //服务器ip
    private static final String IP_ADDRESS = "127.0.0.1";

    public static void main(String[] args) {
        Client2 client2 = new Client2();
        client2.connectionSever();
    }

    private void connectionSever() {
        try {
            //连接服务器
            Socket client = new Socket(IP_ADDRESS,PORT);
            System.out.println("服务器连接成功");
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            Scanner scanner = new Scanner(System.in);
            String userData;
            String serverData;
            do {
                //发送信息给服务器
                System.out.println("请输入信息：");
                userData = scanner.nextLine();
                outputStream.writeUTF(userData);
                //接收服务器的信息
                serverData = inputStream.readUTF();
                System.out.println("服务器：" + serverData);
            } while (!serverData.equals("再见"));
            inputStream.close();
            outputStream.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
