package com.hafiz.www.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Desc:socket编程之 简单socket server
 * Created by hafiz.zhang on 2016/11/30.
 */
public class SocketServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    public SocketServer() {
        try {
            serverSocket = new ServerSocket(9999);
            while (true) {
                // 此处会阻塞，以后会用NIO
                socket = serverSocket.accept();
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                String line = in.readLine();
                System.out.println("line:" + line);
                //返回给客户端，通知我已收到数据
                out.println("your input is :" + line);
                out.close();
                in.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SocketServer();
    }
}
