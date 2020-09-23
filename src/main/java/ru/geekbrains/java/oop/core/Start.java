package ru.geekbrains.java.oop.core;


import ru.geekbrains.java.oop.core.obstacles.Obstacles;
import ru.geekbrains.java.oop.core.obstacles.Treadmill;
import ru.geekbrains.java.oop.core.obstacles.Wall;
import ru.geekbrains.java.oop.core.participants.Cat;
import ru.geekbrains.java.oop.core.participants.Human;
import ru.geekbrains.java.oop.core.participants.Robot;
import ru.geekbrains.java.oop.core.participants.Runner;

public class Start {

    public void trace(Runner[] runners, Obstacles[] obstacles){
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