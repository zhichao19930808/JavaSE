package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sever {
    private static final int PORT = 1025;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            System.out.println("服务器启动中...");
            byte[] bytes = new byte[1024];
            //getLocalHost 获取本机的所有信息（密码除外）
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("服务器启动成功。\n显示服务器信息：");
            String hostName = address.getHostName();
            String hostIP = address.getHostAddress();

            System.out.println(hostName+"\n"+hostIP);

            System.out.println("获取客户端信息传递的信息...");
            //创建报文对象，用于接收从客户端传过来的报文对象
            DatagramPacket dPacket = new DatagramPacket(bytes, bytes.length);
            DatagramSocket socket = new DatagramSocket(PORT,address);
            //接受到客户端发送来的报文对象，并将该对象存入本地的报文对象
            socket.receive(dPacket);

            //用byte数组构造一个字符串对象
            String message = new String(bytes, 0, bytes.length);
            System.out.println("客户端："+message);
            socket.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}