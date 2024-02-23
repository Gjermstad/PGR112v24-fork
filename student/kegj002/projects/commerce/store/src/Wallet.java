package kegj002.projects.commerce.store.src;

public class Wallet
{
    //# Fields
    private Customer owner;
    private int money;


    //# Constructor
    Wallet(Customer owner, int money) {
        this.owner = owner;
        this.money = money;
    }


    //# Getter-methods
    Customer getOwnerOfWallet() {
        return this.owner;
    }

    int getCustomerWalletBalance() {
        return this.money;
    }


    //# Setter-methods
    void setMoney(int value) {
        this.money = value;
    }

    void addMoney(int value) {
        this.setMoney(this.getCustomerWalletBalance() + value);
    }

    //# Methods
    void removeMoney(int value) {
        if (this.getCustomerWalletBalance() >= value) {
            this.setMoney(this.getCustomerWalletBalance() - value);
        }
    }
}
