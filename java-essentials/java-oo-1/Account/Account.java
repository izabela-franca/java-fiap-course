public class Account {

    //Attributes
    String accountNumber;
    String accountOwner;
    double balance;

    //Creating methods
    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito realizado com sucesso!");
            return true;
        }
        System.out.println("Ops, depósito inválido!");
        return false;
    }

    //Method Overloading
    boolean deposit(String amount) {
        return  deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Saque realizado com sucesso!");
            return  true;
        }
        System.out.println("Ops, saque inválido!");
        return  false;
    }

    void transfer(double amount, Account targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    void printBalance() {
        System.out.println("Balance: R$" + balance);
    }
}
