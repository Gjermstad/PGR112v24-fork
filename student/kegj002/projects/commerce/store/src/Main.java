package kegj002.projects.commerce.store.src;


public class Main
{
    public static void main(String[] args) {
        Employee owner = new Employee();

        Store store = new Store("Grocery Heaven", owner);

        Customer customer1 = new Customer(1000);

        System.out.println("Welcome to " + store.getStoreName() + "! Your first stop for all your needs!");

        //# 1) Create products available for purchase

        Product apple = new Product("Apple", 10);
        Product banana = new Product("Banana", 8);
        Product groundMeat = new Product("Ground Beef, 400g", 79);
        Product shreddedCheese = new Product("Shredded Cheese, 1kg", 99);
        Product tortilla = new Product("Tortillas Wholegrain", 4);
        Product salsa = new Product("Salsa sauce, medium", 17);
        Product pineapple = new Product("Pineapple in pieces, 1 can", 15);
        Product lettuce = new Product("Head of lettuce", 29);
        Product tomato = new Product("Tomato", 5);
        Product cucumber = new Product("Cucumber", 19);

        //# 2) Add products to customer's shopping cart

        System.out.println("The customer enters the store and starts adding groceries to her cart.");

        customer1.putProductInCart(tortilla, 5);
        customer1.putProductInCart(salsa, 1);
        customer1.putProductInCart(groundMeat, 2);
        customer1.putProductInCart(shreddedCheese, 1);
        customer1.putProductInCart(tomato, 6);
        customer1.putProductInCart(cucumber, 2);
        customer1.putProductInCart(pineapple, 2);
        customer1.putProductInCart(lettuce, 2);
        customer1.putProductInCart(apple, 4);
        customer1.putProductInCart(banana, 3);

        System.out.println("After a while the customer now has " + customer1.getShoppingCart().size() + " products in their cart.");

        //# 3) Process the buying of products via the cash register
        store.getCashRegister().processCustomer(customer1);

        Customer customer2 = new Customer(500);
        customer2.putProductInCart(apple, 3);
        customer2.putProductInCart(banana, 2);

        store.getCashRegister().processCustomer(customer2);

        Customer customer3 = new Customer(400);
        customer3.putProductInCart(groundMeat, 2);
        customer3.putProductInCart(shreddedCheese, 2);
        customer3.putProductInCart(tortilla, 1);

        store.getCashRegister().processCustomer(customer3);

        //# 4) If the sale is successful,
        // make sure a receipt is generated and added to the cash register
        // Process two customers and afterward print out all receipts

        store.getCashRegister().printAllReceipts();

        // and the total income earned

        store.getCashRegister().printTotalEarnings();

        // Extra:
        // 1) Create custom exceptions for certain situations,
        // for example: not enough money in customer wallet
        // 2) Make sure any values of money can not be negative
        // 3) Make use of:
        //      @Override
        //      public String toString() { ... } in all of the classes
    }
}
