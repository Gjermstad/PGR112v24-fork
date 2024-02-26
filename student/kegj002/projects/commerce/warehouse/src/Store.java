package kegj002.projects.commerce.warehouse.src;

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
        // TODO flytt varen fra lageret til butikken
        // må sjekke om dette er mulig først

        if (this.getWarehouseInventory().checkIfProductInStock(product) && this.getWarehouseInventory().getAmountOfProductInStock(product) >= quantity) {
            this.getStoreInventory().addProduct(product, quantity);
            this.getWarehouseInventory().removeProduct(product, quantity, false);
            System.out.println("*We moved " + quantity + " of " + product + " from the Warehouse to the Store.*");
        } else {
            System.out.println("*ERROR* - Product not available or Insufficient quantity");
        }

    }

    double totalWarehouseValue(boolean printEachProduct) {
        return this.getWarehouseInventory().totalValueOfProductsInInventory(printEachProduct);
    }

    double totalStoreValue() {
        // TODO regn ut verdien på alle varene ute i butikken
        return 0;
    }

    double totalValue() {
        return this.totalWarehouseValue(false) + this.totalStoreValue();
    }
}
