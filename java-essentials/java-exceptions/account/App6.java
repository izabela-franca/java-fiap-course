package account;

public class App6 {

    public static void main(String[] args) {

        Account5 account = new Account5("12345");
        account.deposit(500);
        System.out.println(account);

        try {
            account.withdraw(600);
            System.out.println(account);
        } catch (InsufficientFundsException e) {
            System.out.println("Ops! Insufficient funds. Current balance: " + e.getCurrentBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("The amount cannot be negative.");
        } finally {
            System.out.println("The end");
        }
    }
}
