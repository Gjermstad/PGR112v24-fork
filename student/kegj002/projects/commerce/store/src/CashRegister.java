package kegj002.projects.commerce.store.src;

import java.util.ArrayList;
import java.util.HashMap;

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
        // TODO Fix processing of customer at cashier

        HashMap<Product, Integer> tempCart = customer.getShoppingCart();

        //# 1) Get total price of all products in cart

        int customerCartValue = customer.getTotalPriceForCart();

        System.out.println("The customer comes up to the cashier.");
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

            customer.clearCustomerCart();

            //# 4) Create a receipt

            //# 5) Print the receipt to the terminal

            //# 6) return true

        } else {
            System.out.println("The customer screams as she realises she don't have enought money to pay for everything.");
            System.out.println("She yells to the world and complains about all the prices rising too much for people.");
        }

        //# 7) else:
        return false;
    }

    int totalEarnings() {
        // TODO go through each receipt and sum up all income and return result
        return 0;
    }
}
