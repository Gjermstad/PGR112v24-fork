package kegj002.projects.commerce.store.src;

public class Product
{
    //# Fields
    private final String name;
    private final int price;


    //# Constructors
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    //# Getter-methods
    String getName() {
        return this.name;
    }

    int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
