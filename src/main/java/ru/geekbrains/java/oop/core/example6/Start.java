package ru.geekbrains.java.oop.core.example6;

public class Start {
    public static void main(String[] args) {
        Cat tom = new Cat("Том");
        System.out.println(tom.getName().equals("Том"));

        Dog spike = new Dog("Spike");
        Cat bubbles = new Cat("Шарик");
        Dog barsik = new Dog("Барсик");
        Cat barmaglog = new Cat("Бармаглот");
        Dog lord = new Dog("Лорд");

        Mouse larry = new Mouse("Ларри Мышь");

        CatFood catFood = new CatFood("PurinaOne");

        Animal[] animals = {tom, spike, bubbles, barsik, barmaglog, lord, larry};

        for (Animal animal : animals) {
            animal.eatCatFood(catFood);
        }

        HomeWork[] homeWork = {tom, spike, bubbles, barsik, barmaglog, lord};

        for (HomeWork animalHomeWork : homeWork) {
            animalHomeWork.sayYouHomeWork();
        }

    }
}
