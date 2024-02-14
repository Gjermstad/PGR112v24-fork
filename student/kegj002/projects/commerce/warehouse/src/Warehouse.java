package kegj002.projects.commerce.warehouse.src;

public class Warehouse
{
    //# Fields
    private Store store;
    private Inventory inventory;

    //# Constructor
    Warehouse(Store store) {
        this.store = store;
        this.inventory = new Inventory();
    }

    //# Getters
    Store getStore() {
        return this.store;
    }

    Inventory getInventory() {
        return this.inventory;
    }
}
