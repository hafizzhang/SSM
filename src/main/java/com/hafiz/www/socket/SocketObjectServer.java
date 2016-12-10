package com.hafiz.www.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Desc:socket编程之 ： 传输对象server
 * Created by hafiz.zhang on 2016/11/30.
 */
public class SocketObjectServer {
    private ServerSocket serverSocket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public SocketObjectServer() {
        try {
            serverSocket = new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();

                in = new ObjectInputStream(socket.getInputStream());
                out = new ObjectOutputStream(socket.getOutputStream());

                Student student = (Student)in.readObject();
                System.out.println("Server receive:" + student);
                student.setId(2);
                //返回给client端，通知我已收到数据
                out.writeObject(student);
                out.flush();

                in.close();
                out.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SocketObjectServer();
    }
}
