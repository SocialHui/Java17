package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * UDP客户端
 */
public class UDPClient {

    private static final int port = 9001;  //服务器端的端口号
    private static final String ip = "152.136.255.32";  //服务器端的ip(现在就是本机的ip地址 127.0.0.1)（不能用local）
    private static  final int bleng = 1024;

    public static void main(String[] args) throws IOException {

        /**
         * 客户端连接服务器端的时候要知道服务器端的ip地址和端口号
         */

        //创建客户端
        DatagramSocket socket = new DatagramSocket(); //创建客户端的时候不需要设置端口号，不输入端口号时内核自动生成一个端口号


        //让用户输入需要发送给服务器端的信息
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("->");
            String msg = scanner.nextLine();
            DatagramPacket datagramPacket = new DatagramPacket(
                    msg.getBytes(),
                    msg.getBytes().length,
                    InetAddress.getByName(ip),   //服务器端的ip地址
                    port
            );

            //发送给服务器端
            socket.send(datagramPacket);


            //服务器端前面写了一个反馈信息，在这里可以接收服务器端发送的反馈信息

            DatagramPacket serPacket = new DatagramPacket(
                    new byte[bleng],
                    bleng
            );
            //接收消息
            socket.receive(serPacket);
            System.out.println(new String(serPacket.getData())); //接收到的是字节数组，转换为字符串
        }
    }
}



//将智能机器人项目部署到linux服务器上面
 