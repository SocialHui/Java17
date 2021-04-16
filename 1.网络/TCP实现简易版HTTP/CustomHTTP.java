package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 简易版HTTP实现
 */

public class CustomHTTP {

    //服务器端的端口号
    public static final int port = 9004;
    public static void main(String[] args) throws IOException {

        //创建服务器端并且设置服务器端的端口号
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器端已启动");

        //建立连接
        Socket socket = serverSocket.accept();

        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()))
        ) {
            String firstLine = bufferedReader.readLine();
            if (bufferedReader != null && !bufferedReader.equals("")) {
                String[] fLine = firstLine.split(" ");
                //获取方法
                String method = fLine[0];
                //获取url
                String url = fLine[1];
                //获取http版本号
                String httpVer = fLine[2];
                System.out.println(String.format("读取到客户端请求，方法：%s, url:%s, 版本号：%s",
                        method,url,httpVer));

                //业务逻辑处理
                String content = "<h1>未知</h1>";
                if (url.contains("200")) {
                    content = "<h1>你好，世界</h1>";
                } else if (url.contains("404")) {
                    content = "<h1>没有找到页面</h1>";
                }

                //将结果返回给客户端，即网页
                //写入首行信息
                bufferedWriter.write(httpVer+"200 ok\n");

                //写入head
                bufferedWriter.write("Content-Type: text/html;charset=utf-8\n");
                bufferedWriter.write("Content-Length: " + content.getBytes().length + "\n");

                //写入空行
                bufferedWriter.write("\n");

                //写入body
                bufferedWriter.write(content);
                bufferedWriter.flush();
            }
        }
    }
}
