package ru.geekbrains.java.oop.core.example3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Начало программы");

        File file = new File("src/main/resources/lessons12.txt");
        System.out.println("Сообщение до создания Scanner");
        Scanner scanner = new Scanner(file);
        System.out.println("Сообщение после создания Scanner");


        System.out.println("Конец программы");
    }
}
