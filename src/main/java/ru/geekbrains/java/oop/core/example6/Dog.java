package ru.geekbrains.java.oop.core.example6;

public class Dog extends Animal implements HomeWork{

    public Dog(String name) {
        super(name);
    }

    public void barking(){
        System.out.println("лает");
    }

    public void sayYouHomeWork() {
        System.out.println("Моя работа охранять дом! гав!");
    }
}
