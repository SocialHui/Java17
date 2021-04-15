package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP服务器端
 */

public class UDPServer {
    //服务器端的端口号，端口号冲突的话，服务器启动不起来
    private static final int port = 9001;

    //接收数据容器的大小
    private static final int bleng = 1024;

    public static void main(String[] args) throws IOException {
        //1.创建一个UDP服务器
        //DatagramSocket是数据报的意思
        DatagramSocket socket = new DatagramSocket(port);   //将端口号port设置给服务器

        /**
         * 等待客户端连接
         * ip 自动设置
         * 端口号要自己设置
         */

        //等待服务器连接
        while (true) {

            //客户端的clientPacket
            //new byte[bleng] 载体（容器），必须是比特数组，   bleng，每次接收的最大容量
            //用这个容器DatagramPacket 接收了客户端的信息，从这里面可以获取任何客户端的消息
            DatagramPacket clientPacket = new DatagramPacket(new byte[bleng],bleng);

            //让客户端连接服务器端，但是需要参数，要发送一个消息（上一行）
            socket.receive(clientPacket);

            //已经有客户端连接了
            String msg = new String(clientPacket.getData());  //从容器里面获取客户端信息，接收到的是字节数组，所以需要转换成字符串
            System.out.println("接收到的客户端的消息："+msg);   //在服务器端进行输出

            //下面可以没有
            //给客户端一个反馈信息，

            //只能机器人，将收到的消息中的某些内容进行替换然后反馈给客户端
            String serMsg = msg.replace("吗？","").replace("你","我");  //给客户端发送的内容是什么
            //创建客户端发送数据包
            DatagramPacket serPacket = new DatagramPacket(
                    //发什么，发的长度，发到哪里，发给那个电脑
                    serMsg.getBytes(),      //将发送的消息转换为字节数字
                    serMsg.getBytes().length,    //发送的消息的长度
                    clientPacket.getAddress(),     //客户端的ip
                    clientPacket.getPort()    //客户端的端口号
            );
            //send方法就是给客户端发送消息，但是需要一个参数
            socket.send(serPacket);
        }
    }
}
