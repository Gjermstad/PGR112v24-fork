package kegj002.projects.commerce.store.src;

public class Wallet
{
    //# Fields
    private Customer owner;
    private double money;


    //# Constructor
    Wallet(Customer owner, double money) {
        this.owner = owner;
        this.money = money;
    }


    //# Getter-methods
    public Customer getOwnerOfWallet() {
        return this.owner;
    }

    public double getCustomerWalletBalance() {
        return this.money;
    }


    //# Setter-methods
    public void setMoney(double value) {
        this.money = value;
    }

    //# Methods
    void removeMoneyFromWallet(double value) {
        if (this.getCustomerWalletBalance() >= value) {
            this.setMoney(this.getCustomerWalletBalance() - value);
        }
    }

    public void addMoney(double value) {
        this.setMoney(this.getCustomerWalletBalance() + value);
    }
}
