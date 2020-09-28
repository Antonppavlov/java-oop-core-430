package ru.geekbrains.java.oop.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Наш сервер начал работу");
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket socket = serverSocket.accept();

//        Можно считать поток байт
//        нам нужно преобразовать чтобы мы могли читать текст
//        socket.getInputStream()

//        Таким мы образом мы могли бы считывать посимвольно
//        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
//        inputStreamReader.ready();
//        inputStreamReader.read();

            //Создаем объект BufferedReader который будет накапливать исходящие из InputStreamReader символы
            //накапливать будет их уже построчно и в формате строки

            try (BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                 PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            ) {

                //ждем пока не заполнится строка
                while (!bufferedReader.ready()) ;

                String typeAndMethodRequest = bufferedReader.readLine();

                while (bufferedReader.ready()) {
                    System.out.println(bufferedReader.readLine());
                }

                String[] split = typeAndMethodRequest.split(" ");
                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]);

                printWriter.println("HTTP/1.1 200 OK");
                printWriter.println("Content-type: text/html; charset=utf-8");
                //По требованию протокола HTTP должны отправить пустую строку
                printWriter.println();
                printWriter.println("<h1>Добро пожаловать на наш сервер!</h1>");
                printWriter.flush();
            }

        }

    }
}
