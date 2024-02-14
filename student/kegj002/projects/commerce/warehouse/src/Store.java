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

    //# Methods
    void moveProduct(Product product, int quantity) {
        // TODO flytt varen fra laget til butikken
        // må sjekke om dette er mulig først
    }

    double totalWarehouseValue() {
        // TODO regn ut verdien på alle varene på lager
        return 0;
    }

    double totalStoreValue() {
        // TODO regn ut verdien på alle varene ute i butikken
        return 0;
    }

    double totalValue() {
        return this.totalWarehouseValue() + this.totalStoreValue();
    }
}
