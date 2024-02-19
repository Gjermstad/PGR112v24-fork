package kegj002.projects.commerce.warehouse.src;

public class Product
{
    //# Fields
    private String name;
    private double price;

    //# Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //# Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (price: " + price +')';
    }
}
