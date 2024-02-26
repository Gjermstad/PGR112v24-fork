package kegj002.projects.commerce.store.src;

public class Product
{
    //# Fields
    private final String name;
    private final double price;


    //# Constructors
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    //# Getter-methods
    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }
}
