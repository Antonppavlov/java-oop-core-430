package ru.geekbrains.java.oop.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Наш сервер начал работу");

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket accept = serverSocket.accept();

//        Можно считать поток байт
//        нам нужно преобразовать чтобы мы могли читать текст
//        accept.getInputStream()

//        Таким мы образом мы могли бы считывать посимвольно
//        InputStreamReader inputStreamReader = new InputStreamReader(accept.getInputStream(), StandardCharsets.UTF_8);
//        inputStreamReader.ready();
//        inputStreamReader.read();

        //Создаем объект BufferedReader который будет накапливать исходящие из InputStreamReader символы
        //накапливать будет их уже построчно и в формате строки

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(accept.getInputStream(), StandardCharsets.UTF_8))) {

            //ждем пока не заполнится строка
            while (!bufferedReader.ready()) ;

            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }

        }

        System.out.println("Наш сервер закончил работу");
    }
}
