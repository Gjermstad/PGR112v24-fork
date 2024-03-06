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

    int getBalanceOfWallet() {
        return this.wallet.getCustomerWalletBalance();
    }

    HashMap<Product, Integer> getShoppingCart() {
        return this.cart;
    }

    int getTotalPriceForCart() {
        int totalPrice = 0;

        for (Product product : this.cart.keySet()) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    //# Setter-methods
    void putProductInCart(Product product, Integer quantity) {
        this.cart.put(product, quantity);
    }

    void clearCustomerCart() {
        this.cart.clear();
    }

    //# Methods
    void removeMoney(int value) {
        // TODO
        getWallet().removeMoneyFromWallet(value);
    }
}
