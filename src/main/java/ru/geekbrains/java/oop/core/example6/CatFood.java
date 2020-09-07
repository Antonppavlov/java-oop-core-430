package ru.geekbrains.java.oop.core.example6;

public class CatFood {

    public CatFood(String productName) {
        this.productName = productName;
    }

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
