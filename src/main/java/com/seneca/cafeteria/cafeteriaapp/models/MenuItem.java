package com.seneca.cafeteria.cafeteriaapp.models;

public class MenuItem {
    private String name;
    private String category;
    private double price;

    public MenuItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
}
