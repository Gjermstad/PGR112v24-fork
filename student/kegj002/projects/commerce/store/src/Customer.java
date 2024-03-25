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

    int totalPriceForCart() {
        int totalPrice = 0;

        for (Product product : this.cart.keySet()) {
            int amountOfProduct = this.cart.get(product);

            int priceOfProduct = product.getPrice();

            totalPrice += priceOfProduct * amountOfProduct;
        }

        return totalPrice;
    }

    int totalNumberOfProductsInCart() {
        int tempCounter = 0;

        for (Product product : cart.keySet()) {
            tempCounter += this.cart.get(product);
        }

        return tempCounter;
    }
}
