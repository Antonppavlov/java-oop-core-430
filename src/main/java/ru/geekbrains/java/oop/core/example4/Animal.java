package ru.geekbrains.java.oop.core.example4;

public class Animal {
    private String name;

    public void eatCatFood(CatFood catFood){
        System.out.println(name + " кушает кошачий корм с названием: "+catFood.getProductName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
