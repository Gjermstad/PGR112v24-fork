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
    public Customer getOwnerOfWallet() {
        return this.owner;
    }

    public int getCustomerWalletBalance() {
        return this.money;
    }


    //# Setter-methods
    public void setMoney(int value) {
        this.money = value;
    }

    //# Methods
    void removeMoneyFromWallet(int value) {
        if (this.getCustomerWalletBalance() >= value) {
            this.setMoney(this.getCustomerWalletBalance() - value);
        }
    }

    public void addMoney(int value) {
        this.setMoney(this.getCustomerWalletBalance() + value);
    }
}
