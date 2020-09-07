package ru.geekbrains.java.oop.core.example2;

public class Start {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Том");

        CatFood catFood = new CatFood();
        catFood.setProductName("PurinaOne");

        tom.eat(catFood);

    }
}
