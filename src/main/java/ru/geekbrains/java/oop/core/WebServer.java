package ru.geekbrains.java.oop.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        System.out.println("start");

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket accept = serverSocket.accept();

        System.out.println("stop");
    }
}
