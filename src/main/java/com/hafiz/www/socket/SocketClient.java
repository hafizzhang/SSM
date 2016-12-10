package com.hafiz.www.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Desc:socket编程之：简单socket client
 * Created by hafiz.zhang on 2016/11/30.
 */
public class SocketClient {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public SocketClient() {
        try {
            socket = new Socket("127.0.0.1", 9999);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            //向服务端写数据
            BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
            out.println(line.readLine());
            line.close();
            // 打印出来服务端发回来的回执
            System.out.println(in.readLine());
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SocketClient();
    }
}
