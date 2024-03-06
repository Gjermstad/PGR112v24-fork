package kegj002.projects.commerce.warehouse.src;

import java.util.HashMap;

public class Store
{
    //# Fields
    private Warehouse warehouse;
    private Inventory inventory = new Inventory();

    //# Constructor
    Store() {
        this.warehouse = new Warehouse(this);
    }

    //# Getters
    private Warehouse getWarehouse() {
        return this.warehouse;
    }

    Inventory getWarehouseInventory() {
        return this.getWarehouse().getInventory();
    }

    Inventory getStoreInventory() {
        return this.inventory;
    }

    //# Methods
    void moveProductFromWarehouseToStore(Product product, int quantity) {

        if (this.getWarehouseInventory().checkIfProductInStock(product) && this.getWarehouseInventory().getAmountOfProductInStock(product) >= quantity) {
            this.getStoreInventory().addProduct(product, quantity);
            this.getWarehouseInventory().removeProduct(product, quantity, false);
            System.out.println("*We moved " + quantity + " of " + product + " from the Warehouse to the Store.*");
        } else {
            System.out.println("*ERROR* - " + product + " not available or Insufficient quantity for moving " + quantity + ".");
        }

    }

    void moveAllProductsFromWarehouseToStore() {
        HashMap<Product, Integer> wareInventory =  this.getWarehouseInventory().getProducts();

        for (Product product : wareInventory.keySet()) {
            int quantity = this.getWarehouseInventory().getAmountOfProductInStock(product);

            this.getStoreInventory().addProduct(product, quantity);
            System.out.println("*We moved " + quantity + " of " + product + " from the Warehouse to the Store.*");
        }

        System.out.println("*All products moved from Warehouse to the Store.*");

        this.getWarehouseInventory().getProducts().clear();

    }

    double totalWarehouseValue(boolean printEachProduct) {
        return this.getWarehouseInventory().totalValueOfProductsInInventory(printEachProduct);
    }

    double totalStoreValue() {
        return getStoreInventory().totalValueOfProductsInInventory(false);
    }

    double totalValue() {
        return this.totalWarehouseValue(false) + this.totalStoreValue();
    }
}
