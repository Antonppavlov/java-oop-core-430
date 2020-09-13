package ru.geekbrains.java.oop.core.example4;

import java.io.File;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Начало программы");

        File file = new File("src/main/resources/lessons12.txt");
        System.out.println("Сообщение до создания Scanner");


        try {
            String name = null;
            name.equals("Имя");

            Scanner scanner = new Scanner(file);

        } catch (Throwable e) {
            e.printStackTrace();
        }


        System.out.println("Сообщение после создания Scanner");


        System.out.println("Конец программы");
    }
}
