package ru.geekbrains.java.oop.core.example3;

public class Start {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Том");

        Dog spike = new Dog();
        spike.setName("Spike");

        CatFood catFood = new CatFood();
        catFood.setProductName("PurinaOne");


        spike.eatCatFood(catFood);
        tom.eatCatFood(catFood);

        spike.barking();
        tom.meows();

    }
}
