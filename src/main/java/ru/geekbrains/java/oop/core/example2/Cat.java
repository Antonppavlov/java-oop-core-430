package ru.geekbrains.java.oop.core.example2;

public class Cat {
   private String name;

    void eat(CatFood catFood){
        System.out.println(name + " кушает кошачий корм с названием: "+catFood.getProductName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
