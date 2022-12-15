package account;

public class Account4 {

    private final String number;
    private double balance;

    public Account4(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{

        if (amount < 0 ) {
            throw new RuntimeException("Amount cannot be negative");    //Unchecked exceptions
        }

        if (balance - amount < 0) {
            throw new InsufficientFundsException(balance);     //Personalized exceptions
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
