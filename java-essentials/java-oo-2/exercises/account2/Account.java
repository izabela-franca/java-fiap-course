package exercises.accout2;

public abstract class Account {

    //Attributes
    private double balance;

    //Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    //Methods
    public double getBalance() {
        return balance;
    }

    public void updateBalance() {
        balance += balance * rate();
    }

    //Abstract method
    abstract double rate();
}
