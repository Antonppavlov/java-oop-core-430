package ru.geekbrains.java.oop.core.example6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        File file = new File("src/main/resources/lessons12.txt");

        System.out.println("Конец программы");

        try {
            System.out.println("Блок 1 до Scanner");
            Scanner scanner = new Scanner(file);
            System.out.println("Блок 1 после Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("Блок 2");
        }finally {
            System.out.println("Блок 3");
        }

        System.out.println("Начало программы");
    }
}
