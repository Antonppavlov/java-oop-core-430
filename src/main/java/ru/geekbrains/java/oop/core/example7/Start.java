package ru.geekbrains.java.oop.core.example7;


public class Start {

    public static void main(String[] args) {
        Dog lord = new Dog(55443322);
        Dog tomas =new Dog(55143322);

        System.out.println(lord.equals(tomas));
    }
}
