package app;

import account.Account;
import account.SavingsAccount;

public class App1 {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.setNumber("1234-5");
        a1.setOwner("Izabela");
        a1.setBalance(1500);

        a1.print();

        SavingsAccount a2 = new SavingsAccount();
        a2.setNumber("5432-1");
        a2.setOwner("Diego");
        a2.setBalance(1500);

        a2.print();
    }

}
