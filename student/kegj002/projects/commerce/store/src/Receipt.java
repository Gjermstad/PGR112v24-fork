package kegj002.projects.commerce.store.src;

import java.util.HashMap;
import java.util.Map;


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
    int totalPriceOfReceipt() {
        int totalValue = 0;

        for (Product product : products.keySet()) {
            int amountOfProduct = this.products.get(product);;

            int productPrice = product.getPrice();

            totalValue += productPrice * amountOfProduct;
        }

        return totalValue;
    }

    int totalDifferentProducts() {
        return this.products.size();
    }

    int totalNumberOfProductsInCart() {
        int tempCounter = 0;

        for (Product product : products.keySet()) {
            tempCounter += this.products.get(product);
        }

        return tempCounter;
    }

    // Prints a receipt already created by the cashregister, can't be used for created a new receipt
    void printReceipt() {

        System.out.println("---------------------");
        System.out.println("------RECEIPT#" + getReceiptNumber() + "------");

        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            Integer amount = products.get(product);

            System.out.println(product.getValue() + "x " + product.getKey().getName() + " á $" + product.getKey().getPrice());
        }
        System.out.println("---------------------");

        System.out.println("Total = $" + totalPriceOfReceipt() + " for " + totalNumberOfProductsInCart() + " products.");

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Receipt #" + this.receiptNumber + " [" + this.totalDifferentProducts() + " products; total $" + this.totalPriceOfReceipt() + "]" ;
    }
}
