public class App3 {

    public static void main(String[] args) {

        Account a = new Account();
        Account b = new Account();

        a.deposit(1000);
        a.deposit("300");

        b.deposit(550);

        a.transfer(100, b);

        a.printBalance();
        b.printBalance();
    }
}
