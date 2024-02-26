package kegj002.projects.commerce.store.src;

import java.util.HashMap;

public class Customer
{
    //# Fields
    private Wallet wallet;
    private HashMap<Product, Integer> cart;


    //# Constructors
    Customer(int moneyInWallet) {
        this.wallet = new Wallet(this, moneyInWallet);
        this.cart = new HashMap<>();
    }


    //# Getter-methods
    Wallet getWallet() {
        return this.wallet;
    }

    double getBalanceOfWallet() {
        return this.wallet.getCustomerWalletBalance();
    }

    HashMap<Product, Integer> getShoppingCart() {
        return this.cart;
    }


    //# Setter-methods


    //# Methods
    void removeMoney(double value) {
        // TODO
        getWallet().removeMoneyFromWallet(value);
    }
}
