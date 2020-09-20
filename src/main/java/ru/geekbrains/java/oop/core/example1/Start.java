package ru.geekbrains.java.oop.core.example1;

public class Start {
    public static void main(String[] args) {

        System.out.println("Привет мир!");

        try {
            Cat.arithmetic();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


        String name = null;


        try {
            name.equals("Имя");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


        System.out.println("Пока мир!");
    }

}
