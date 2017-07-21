package udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
 * DatageamPacket
 * 数据报文对象
 * 负责将数据以保温的形式通过udp新协议发送到服务端
 * udp对纯熟的数据字节限制为：65593字节；其中 数据保温对象强制占用8kb(头信息等)。所以实际发哦那个的字节总数为65593-8=65585
 */
public class User {
    private static final int PORT = 1025;
    private static final String IP_ADDRESS = "172.16.23.249";
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            System.out.println("客户端启动中");
            String wjw = "hello";
            byte[] bytes ;
            bytes = wjw.getBytes();
            //构造一个网络地址的对象
            // 在udp协议中，IP地址不再是String类型，而是变成了网络地址（inetaddress）的对象；
            //通过服务器的地址来获取服务器的信息,将该对象作为头信息传递到数据报文对象中。
            InetAddress address = InetAddress.getByName(IP_ADDRESS);

            DatagramPacket dPacket = new DatagramPacket(bytes, bytes.length,address,PORT);

            //基于udp的socket对象
            System.out.println("准备发送消息");
            DatagramSocket socket = new DatagramSocket();
            //将客户数据包发送出去
            socket.send(dPacket);
            System.out.println("消息发送成功");
            socket.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}