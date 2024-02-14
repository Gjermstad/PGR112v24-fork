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

        //# Flytt varer fra lageret til butikken

        // Print ut varehusets verdi

        // Print ut butikkens verdi

        // Print ut samlet verdi
    }
}
