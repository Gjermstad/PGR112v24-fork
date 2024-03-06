package kegj002.projects.commerce.store.src;

import java.util.HashMap;


public class Receipt
{
    //# Fields
    private final HashMap<Product, Integer> products;

    private static int counter = 0;
    private final int receiptNumber;


    //# Constructors
    Receipt(HashMap<Product, Integer> products) {
        this.products = products;
        this.receiptNumber = Receipt.counter++;
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
        return 0; // TODO
    }

    int totalProducts() {
        return 0; // TODO
    }
}
