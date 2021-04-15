package tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    //服务器端口号
    public static final int port = 9002;
    //服务器ip地址
    public static final String ip = "127.0.0.1";

    public static void main(String[] args) throws IOException {

        //创建客户端并且进行连接
        Socket socket = new Socket(ip,port);

        try(BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner scanner = new Scanner(System.in)
        ) {

            while (true) {
                System.out.print("->");
                String msg = scanner.nextLine();
                if (msg != null) {
                    //发送信息
                    bufferedWriter.write(msg+"\n");
                    bufferedWriter.flush();

                    //接收服务器端反馈的信息
                    String serMsg = bufferedReader.readLine();
                    System.out.println("服务器反馈信息：" +serMsg);
                }
            }
        }
    }
}
