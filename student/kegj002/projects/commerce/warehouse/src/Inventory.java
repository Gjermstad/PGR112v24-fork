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
    public double totalValueOfProductsInWarehouse(boolean showEachProduct) {
        System.out.println("*Calculating total value of products in the Warehouse...*");
        double totalValue = 0;

        for (Product product : products.keySet()) {
            Integer amountOfProduct = this.getAmountOfProductInStock(product);;
            Double productPrice = product.getPrice();

            totalValue += productPrice * amountOfProduct;

            if (showEachProduct) System.out.println("- We have [" + amountOfProduct + "] of the item " + product.getName() + " worth $" + product.getPrice() + " [subtotal so far: " + totalValue + "].");
        }

        System.out.println("Total value of all products in stock when sold is $" + totalValue);

        return totalValue;
    }

    public int totalAmountOfProductsInWarehouse() {
        System.out.println("*Counting the stock in the Warehouse...*");
        double total = 0;

        for (Product product : products.keySet()) {
            total += products.get(product);
        }
        System.out.println("There are " + (int) total + " products in the Warehouse.");
        return (int) total;
    }

    void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    void removeProduct(Product product, int quantity) {

        for (Product currentProduct : products.keySet()) {

            if (currentProduct.equals(product)) {

                if (products.get(product) > quantity) {
                    System.out.println("We have " + this.getAmountOfProductInStock(product) + " of the product " + product + " in the Warehouse inventory.");
                    System.out.println("We remove " + quantity + " of the product " + product + " from the Warehouse inventory.");

                    this.products.put(product, products.get(product) - quantity);

                    System.out.println("We now have " + products.get(product) + " left of " + product + " in the Warehouse.");

                } else if (products.get(product) == quantity) {

                    this.products.remove(product);
                    System.out.println("We now have none left of " + product + " in the Warehouse.");

                } else {
                    System.out.println("Insufficient Stock! Only " + products.get(product) + " available of " + product);
                }

            }

        }

    }
}
