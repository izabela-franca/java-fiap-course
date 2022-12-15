package account;

public class Account3 {

    private final String number;
    private double balance;

    public Account3(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception{

        if (amount < 0 ) {
            throw new RuntimeException("Amount cannot be negative");    //Unchecked exceptions
        }

        if (balance - amount < 0) {
            throw new Exception("Insufficient funds");     //Checked exceptions
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
