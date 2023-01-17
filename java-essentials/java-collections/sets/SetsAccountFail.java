package sets;

import java.util.Objects;

public class SetsAccountFail {

    private final String number;
    private final double balance;


    public SetsAccountFail(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    //To make sure objects are not duplicated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetsAccountFail account = (SetsAccountFail) o;
        return Double.compare(account.balance, balance) == 0 && Objects.equals(number, account.number);
    }

    //Changing the hashCode - Not recommended
    @Override
    public int hashCode() {
        return (int) (Math.random() * 1000);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
