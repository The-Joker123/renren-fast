package io.BIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author OverChat
 * @date
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {


        try {

            while (true) {
                ServerSocket socket = new ServerSocket(8082);
                System.out.println("等待客户端连接...");
                // 同步阻塞，直到建立连接
                Socket client = socket.accept();

                // 有客户端连接了，发送一个消息给客户端
                OutputStream output = client.getOutputStream();
                output.write(("客户端[" + client.getPort() + "]你好，你已成功连接到8082服务端").getBytes());
                output.flush();
                System.out.println("客户端已连接:" + client.getPort());
                try {
                    InputStream input = client.getInputStream();
                    byte[] bytes = new byte[1024];
                    // 同步阻塞 读取客户端数据 直到输入数据
                    while (input.read(bytes) != -1) {
                        output.write(("收到了你的消息:" + new String(bytes)).getBytes());
                        output.flush();
                        System.out.println("收到客户端消息:" + new String(bytes));
                    }
                } catch (IOException ex) {
                    // 客户端链接断开则引发异常
                    System.err.println("引发异常：" + ex.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
