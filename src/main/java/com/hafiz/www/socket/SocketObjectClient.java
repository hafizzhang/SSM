package com.hafiz.www.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

/**
 * Desc:socket编程之：传输对象client
 * Created by hafiz.zhang on 2016/11/30.
 */
public class SocketObjectClient {
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public SocketObjectClient() {
        try {
            socket = new Socket("127.0.0.1", 9999);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            //创建一个student对象，用于传输
            Student student = new Student();
            student.setId(1);
            student.setName("hafiz.zhang");
            student.setBirthday(new Date());

            out.writeObject(student);
            out.flush();
            Student  receive = (Student) in.readObject();
            System.out.println("Client Receive:" + receive);

            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SocketObjectClient();
    }
}
