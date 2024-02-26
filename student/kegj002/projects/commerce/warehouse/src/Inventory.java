package kegj002.projects.commerce.warehouse.src;

import java.util.HashMap;

public class Inventory
{
    private HashMap<Product, Integer> products = new HashMap<>();

    //# Getters
    public int getAmountOfProductInStock(Product product) {
        return products.get(product);
    }

    public boolean checkIfProductInStock(Product product) {
        return products.containsKey(product);
    }

    //# Methods
    public double totalValueOfProductsInInventory(boolean showEachProduct) {
        if (showEachProduct) System.out.println("*Calculating total value of products in the Warehouse...*");

        double totalValue = 0;

        for (Product product : products.keySet()) {
            Integer amountOfProduct = this.getAmountOfProductInStock(product);;
            Double productPrice = product.getPrice();

            totalValue += productPrice * amountOfProduct;

            if (showEachProduct) System.out.println("- We have [" + amountOfProduct + "] of the item " + product.getName() + " worth $" + product.getPrice() + " [subtotal so far: " + totalValue + "].");
        }

        if (showEachProduct) System.out.println("Total value of all products in stock when sold is $" + totalValue);

        return totalValue;
    }

    public int totalNumberOfProductsInInventory(boolean printText) {
        if (printText) System.out.println("*Counting the stock in the Warehouse...*");
        double total = 0;

        for (Product product : products.keySet()) {
            total += products.get(product);
        }

        if (printText) System.out.println("There are " + (int) total + " products in the Warehouse.");
        return (int) total;
    }

    void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    void removeProduct(Product product, int quantity, boolean printText) {

        for (Product currentProduct : products.keySet()) {

            if (currentProduct.equals(product)) {

                if (printText) System.out.println("*Updating inventory...*");
                if (printText) System.out.println("We have " + this.getAmountOfProductInStock(product) + " of the product " + product + " in the Warehouse inventory.");

                if (products.get(product) > quantity) {
                    if (printText) System.out.println("We remove " + quantity + " of the product " + product + " from the Warehouse inventory.");

                    this.products.put(product, products.get(product) - quantity);

                    if (printText) System.out.println("We now have " + products.get(product) + " left of " + product + " in the Warehouse.");

                } else if (products.get(product) == quantity) {

                    this.products.remove(product);
                    if (printText) System.out.println("We removed all of " + product + " from the Warehouse.");

                } else {
                    System.out.println("Insufficient Stock!");
                    System.out.println("Only " + products.get(product) + " available of " + product + ".");
                }

            }

        }

    }

    @Override
    public String toString() {
        return "Inventory {" +
                "number of unique products = " + products.size() +
                " / total stock = " + this.totalNumberOfProductsInInventory(false) +
                '}';
    }
}
