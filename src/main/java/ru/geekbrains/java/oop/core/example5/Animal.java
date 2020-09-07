package ru.geekbrains.java.oop.core.example5;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eatCatFood(CatFood catFood){
        System.out.println(name + " кушает кошачий корм с названием: "+catFood.getProductName());
    }

    public String getName() {
        return name;
    }

}
