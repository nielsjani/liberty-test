package com.liberty.product.Product;


public class Product {
    private int id;
    private String name;

    private int priceInCent;

    public Product() {
    }

    public Product(String name, int priceInCent) {
        this.name = name;
        this.priceInCent = priceInCent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCent() {
        return priceInCent;
    }

    public void setPriceInCent(int priceInCent) {
        this.priceInCent = priceInCent;
    }
}
