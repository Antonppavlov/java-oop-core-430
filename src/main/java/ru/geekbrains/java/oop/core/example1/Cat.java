package ru.geekbrains.java.oop.core.example1;

public class Cat {
    String name;

    void eat(CatFood catFood){
        System.out.println(name + " кушает кошачий корм с названием: "+catFood.productName);
    }
}
