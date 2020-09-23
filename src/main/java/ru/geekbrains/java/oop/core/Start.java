package ru.geekbrains.java.oop.core;


import ru.geekbrains.java.oop.core.obstacles.Obstacles;
import ru.geekbrains.java.oop.core.obstacles.Treadmill;
import ru.geekbrains.java.oop.core.obstacles.Wall;
import ru.geekbrains.java.oop.core.participants.Cat;
import ru.geekbrains.java.oop.core.participants.Human;
import ru.geekbrains.java.oop.core.participants.Robot;
import ru.geekbrains.java.oop.core.participants.Runner;

public class Start {

    public static void main(String[] args) {
        Cat catTom = new Cat("Tom", 10, 5);
        Cat catLarry = new Cat("Larry", 7, 3);
        Cat catBoris = new Cat("Boris", 15, 8);

        Runner humanMax = new Human("Max", 13, 4);
        Runner humanAnna = new Human("Anna", 10, 2);
        Runner humanAlex = new Human("Alex", 18, 6);

        Runner robotVally = new Robot("Vally", 13, 4);
        Runner robotEva = new Robot("Eva", 15, 15);
        Runner robotBender = new Robot("Bender", 18, 6);

        Runner[] runners = {catTom, catLarry, catBoris, humanMax, humanAnna, humanAlex, robotVally, robotEva, robotBender};

        Obstacles[] obstacles = {
                new Wall(5),
                new Wall(6),
                new Treadmill(10),
                new Wall(7),
                new Treadmill(14),
                new Treadmill(15),
        };

        trace(runners, obstacles);
    }

    public static void trace(Runner[] runners, Obstacles[] obstacles) {
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("\n\nИспытание " + (i + 1));

            for (Runner runner : runners) {
                if (runner.getSuccess()) {
                    System.out.println("------------");
                    obstacles[i].check(runner);
                }
            }
        }
    }
}