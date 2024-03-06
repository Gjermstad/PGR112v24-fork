package kegj002.projects.commerce.store.src;

import java.util.HashMap;


public class Receipt
{
    //# Fields
    private final HashMap<Product, Integer> products;

    private static int counter = 1;
    private final int receiptNumber;


    //# Constructors
    Receipt(HashMap<Product, Integer> products) {
        this.products = products;
        this.receiptNumber = counter++;
    }


    //# Getter-methods
    HashMap<Product, Integer> getProducts() {
        return this.products;
    }

    public int getReceiptNumber() {
        return this.receiptNumber;
    }

    //# Methods
    int totalPrice() {
        int totalValue = 0;

        for (Product product : products.keySet()) {
            int amountOfProduct = this.products.get(product);;

            int productPrice = product.getPrice();

            totalValue += productPrice * amountOfProduct;
        }

        return totalValue;
    }

    int totalProducts() {
        return this.products.size();
    }

    @Override
    public String toString() {
        return "Receipt #" + this.receiptNumber + " [" + this.totalProducts() + " products; total $" + this.totalPrice() + "]" ;
    }
}
