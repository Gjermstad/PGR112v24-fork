package kegj002.projects.commerce.store.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CashRegister
{
    //# Fields
    private int money;
    private Employee employee;
    private ArrayList<Receipt> receipts;


    //# Constructor
    CashRegister(Employee employee) {
        this.money = 0;
        this.employee = employee;
        this.receipts = new ArrayList<>();
    }


    //# Getter-methods
    int getMoney() {
        return this.money;
    }

    Employee getEmployee() {
        return this.employee;
    }

    int getEmployeeNumber() {
        return this.getEmployee().getEmployeeNumber();
    }

    ArrayList<Receipt> getReceipts() {
        return this.receipts;
    }

    //# Setter-methods
    void addMoneyToCashRegister(int sum) {
        this.money += sum;
    }


    //# Methods
    boolean processCustomer(Customer customer) {

        HashMap<Product, Integer> tempCart = new HashMap<>();

        for (Map.Entry<Product, Integer> entry : customer.getShoppingCart().entrySet()) {
            Product tempProduct = entry.getKey();
            Integer tempInteger = entry.getValue();

            tempCart.put(tempProduct, tempInteger);
        }

        //# 1) Get total price of all products in cart

        int customerCartValue = customer.totalPriceForCart();

        System.out.println(" ");
        System.out.println("A customer comes up to the cashier.");
        System.out.println("The customer puts her " + customer.totalNumberOfProductsInCart() + " products on the band.");
        System.out.println("After scanning all items the total is $" + customerCartValue + ".");

        //# 2) Check if customer has enough money in wallet

        if (customer.getBalanceOfWallet() >= customerCartValue) {

            //# 3) If customer has enough money:
            //# 3.1) Remove money from wallet

            customer.removeMoney(customerCartValue);
            System.out.println("The customer takes out her wallet and hands over her money.");
            System.out.println("She now have $" + customer.getBalanceOfWallet() + " left.");

            //# 3.2) Add money to cash register

            this.addMoneyToCashRegister(customerCartValue);

            //# 3.3) Clear products from customer cart

            System.out.println("The groceries are put in the customer's bags.");

            //# 4) Create a receipt
            //# 5) Print the receipt to the terminal
            this.createAndPrintNewReceipt(customer);

            //# 6) return true

            customer.clearCustomerCart();
            return true;

        } else {
            System.out.println("The customer screams as she realises she don't have enough money to pay for everything.");
            System.out.println("She yells to the world and complains about all the prices rising too much for people.");
            System.out.println("The customer then flees the store sobbing hard...");

            //# 7) else:
            return false;
        }

    }
    void createAndPrintNewReceipt(Customer customer) {
        HashMap<Product, Integer> tempCart = new HashMap<>();

        for (Map.Entry<Product, Integer> entry : customer.getShoppingCart().entrySet()) {
            Product tempProduct = entry.getKey();
            Integer tempInteger = entry.getValue();

            tempCart.put(tempProduct, tempInteger);
        }

        Receipt receipt = new Receipt(tempCart);

        receipts.add(receipt);

        System.out.println("Printing the customers receipt:");

        System.out.println("---------------------");
        System.out.println("------RECEIPT#" + receipt.getReceiptNumber() + "------");

        for (Map.Entry<Product, Integer> product : tempCart.entrySet()) {
            Integer amount = tempCart.get(product);

            System.out.println(product.getValue() + "x " + product.getKey().getName() + " á $" + product.getKey().getPrice());
        }
        System.out.println("---------------------");

        System.out.println("Total = $" + receipt.totalPriceOfReceipt() + " for " + receipt.totalNumberOfProductsInCart() + " products.");

        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println(" ");
    }

    void printAllReceipts() {
        System.out.println("*Z rapport running - Printing copy of today's receipts:*");
        System.out.println(" ");

        for (Receipt receipt : receipts) {
            receipt.printReceipt();
        }
    }

    void printTotalEarnings() {
        int tempCounter = 0;

        for (Receipt receipt : receipts) {
            tempCounter += receipt.totalPriceOfReceipt();
        }

        System.out.println("The gross total for today's shopping is $" + tempCounter + ".");
    }
}
