package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务器端
 */
public class TCPServer {
    //端口号
    public static final int port = 9002;

    public static void main(String[] args) throws IOException {

        //创建TCP服务器端
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器启动成功");

        //等待客户端连接
        Socket client = serverSocket.accept();   //TCP需要先建立连接

        //有客户端连接以后就对客户端的信息进行一个打印
        System.out.println(String.format("有客户端连接了，客户端IP：%s，端口号：%d",
                client.getInetAddress().getHostAddress(),client.getPort()));

        //Buffer接收缓冲区，相当于菜鸟驿站，  这样可以增加效率（提高性能的措施）
        //缓冲区要进行刷新
/*        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        //用太容易try finally包裹的原因：可能连接获取参数过程中出现异常，以至于不能正常关闭
        try {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(client.getInputStream())   //获取读取的对象（获取输入流）
            );//接收对象，创建接收缓冲区对象

            //接收服务器端的信息
            String msg = bufferedReader.readLine();  //按行读入信息

            //获取输出对象
            String serMsg = "我收到了";
            bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(client.getOutputStream())); //获取输出流
            bufferedWriter.write(serMsg+"\n"); //写入消息时必须加上\n，因为时按行读入的

            //读入完成以后要对缓冲区进行刷新
            bufferedWriter.flush();

        } finally {
            if (bufferedReader != null) {
                //使用结束以后要将建立的连接关闭
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }*/


        //用try catch 包裹的写法看起来很复杂，所以有了另一种写法
        //try-resouce  不用自己进行关闭
        try(BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(client.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(client.getInputStream()))) {
            //将需要关闭的放在try里面就可以实现自动关闭

            //获取输入的信息
            while (true) {
                String msg = bufferedReader.readLine();
                if (msg != null) {
                    System.out.println("收到客户端的信息："+msg);

                    //给客户端返回信息
                    String serMsg = "我收到了";
                    bufferedWriter.write(serMsg+"\n");
                    bufferedWriter.flush();
                }
            }
        }
    }
}
