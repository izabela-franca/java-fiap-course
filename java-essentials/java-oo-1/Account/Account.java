public class Account {

    //Attributes
    String accountNumber;
    String accountOwner;
    double balance;

    //Creating methods
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void printBalance() {
        System.out.println("Balance: R$" + balance);
    }
}
