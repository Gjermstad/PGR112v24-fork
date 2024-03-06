package kegj002.projects.commerce.store.src;


public class Main
{
    public static void main(String[] args) {
        Employee owner = new Employee();

        Store store = new Store("Grocery Heaven", owner);

        Customer customer = new Customer(1000);

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

        customer.putProductInCart(tortilla, 5);
        customer.putProductInCart(salsa, 1);
        customer.putProductInCart(groundMeat, 2);
        customer.putProductInCart(shreddedCheese, 1);
        customer.putProductInCart(tomato, 6);
        customer.putProductInCart(cucumber, 2);
        customer.putProductInCart(pineapple, 2);
        customer.putProductInCart(lettuce, 2);
        customer.putProductInCart(apple, 4);
        customer.putProductInCart(banana, 3);

        System.out.println("After a while the customer now has " + customer.getShoppingCart().size() + " products in their cart.");

        //# 3) Process the buying of products via the cash register
        boolean success = store.getCashRegister().processCustomer(customer);

        //# 4) If the sale is successful,
        // make sure a receipt is generated and added to the cash register

        // ---

        // Process two customers and afterward print out all receipts
        // and the total income earned

        for (Receipt receipt : store.getCashRegister().getReceipts()) {
            System.out.println(receipt);
        }

        System.out.println(store.getCashRegister().totalEarnings());

        // Extra:
        // 1) Create custom exceptions for certain situations,
        // for example: not enough money in customer wallet
        // 2) Make sure any values of money can not be negative
        // 3) Make use of:
        //      @Override
        //      public String toString() { ... } in all of the classes
    }
}
