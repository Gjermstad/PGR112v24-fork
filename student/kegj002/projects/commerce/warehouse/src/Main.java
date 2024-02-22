package kegj002.projects.commerce.warehouse.src;

public class Main
{
    public static void main(String[] args) {
        Store store = new Store();

        //# Opprett mange forskjellige produkter
        // og legg de til i lageret

        Product headphones = new Product("Airpods Pro", 2995);
        Product laptop = new Product("Macbook Pro", 17995);
        Product cellphone = new Product("iPhone 15 Pro Max", 14995);
        Product charger = new Product("Belkin 20W charger", 599);
        Product cable = new Product("Belkin cable, 2m", 349);
        Product energyDrink1 = new Product("Red Bull, 0,5l", 24.95);

        store.getWarehouseInventory().addProduct(headphones, 1);
        store.getWarehouseInventory().addProduct(laptop, 1);
        store.getWarehouseInventory().addProduct(cellphone, 1);
        store.getWarehouseInventory().addProduct(charger, 1);
        store.getWarehouseInventory().addProduct(cable, 1);
        store.getWarehouseInventory().addProduct(energyDrink1, 10);

        store.getWarehouseInventory().totalAmountOfProductsInWarehouse();

        store.getWarehouseInventory().totalValueOfProductsInWarehouse(false);

        store.getWarehouseInventory().removeProduct(energyDrink1, 2);

        System.out.println("Value of this Warehouse: $" + store.totalWarehouseValue(false));

        store.getWarehouseInventory().removeProduct(energyDrink1, 3);

        System.out.println("Value of this Warehouse: $" + store.totalWarehouseValue(false));

        /*


        System.out.println("We sell a product.");


        store.getWarehouseInventory().totalAmountOfProductsInWarehouse();
        System.out.println(store.getWarehouseInventory().checkIfProductInStock(laptop));
        store.getWarehouseInventory().removeProduct(laptop, 1);
        System.out.println(store.getWarehouseInventory().checkIfProductInStock(laptop));
        */

        //# Flytt varer fra lageret til butikken

        // Print ut varehusets verdi

        // Print ut butikkens verdi

        // Print ut samlet verdi
    }
}
