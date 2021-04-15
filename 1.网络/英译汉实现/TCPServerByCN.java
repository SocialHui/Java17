package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 英译汉服务器
 */
public class TCPServerByCN {
    public static final int port = 9003;
    public static void main(String[] args) throws IOException {

        //创建服务器   创建服务端的时候记得给服务器端设置端口号
        ServerSocket serverSocket = new ServerSocket(port);

        //建立连接
        Socket client = serverSocket.accept();
        System.out.println("英译汉服务器已启动");

        try(BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(client.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(client.getInputStream()))
        ) {
            while (true) {
                String en = bufferedReader.readLine();
                System.out.println("接收到客户端信息为："+en);
                if (en != null) {
                    String cn = processData(en);
                    bufferedWriter.write(cn+"\n");
                    bufferedWriter.flush();
                }
            }
        }

    }

    /**
     * 翻译方法
     * @param en
     * @return
     */
    private static String processData(String en) {
        String cn = "未知";
        switch (en) {
            case "dog":
                cn = "狗";
                break;
            case "cat":
                cn = "猫";
                break;
            case "hello":
                cn = "你好";
                break;
            default:
                break;
        }
        return cn;
    }
}
