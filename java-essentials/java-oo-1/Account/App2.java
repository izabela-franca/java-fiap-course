public class App2 {

    public static void main(String[] args) {

        Account a = new Account();

        a.deposit(300);
        a.deposit((50));
        a.withdraw(25);
        a.printBalance();
    }
}
