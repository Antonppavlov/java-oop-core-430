package ru.geekbrains.java.oop.core.example6;

public class Cat extends Animal implements HomeWork{

    public Cat(String name){
        super(name);
    }

    public void meows(){
        System.out.println("мяукает");
    }

    public void sayYouHomeWork() {
        System.out.println("Моя домашняя работа ловить грызунов");
    }
}
