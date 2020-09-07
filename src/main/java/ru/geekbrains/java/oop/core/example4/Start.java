package ru.geekbrains.java.oop.core.example4;

public class Start {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("Том");

        Dog spike = new Dog();
        spike.setName("Spike");

        Cat bubbles = new Cat();
        bubbles.setName("Шарик");

        Dog barsik = new Dog();
        barsik.setName("Барсик");

        Cat barmaglog = new Cat();
        barmaglog.setName("Бармаглот");

        Dog lord = new Dog();
        lord.setName("Лорд");

        CatFood catFood = new CatFood();
        catFood.setProductName("PurinaOne");

        Animal[] animals = {tom, spike, bubbles, barsik, barmaglog, lord};

        for (Animal animal: animals){
            animal.eatCatFood(catFood);
        }

    }
}
