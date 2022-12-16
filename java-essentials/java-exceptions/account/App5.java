package account;

public class App5 {

    public static void main(String[] args) {

        Account4 account = new Account4("12345");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);
        } catch (InsufficientFundsException e) {
            System.out.println("Ops! Insufficient funds.");
        }
    }
}
