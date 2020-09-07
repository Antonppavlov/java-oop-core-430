package ru.geekbrains.java.oop.core.example1;

public class Start {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "Том";

        CatFood catFood = new CatFood();
        catFood.productName = "PurinaOne";

        tom.eat(catFood);

    }
}
