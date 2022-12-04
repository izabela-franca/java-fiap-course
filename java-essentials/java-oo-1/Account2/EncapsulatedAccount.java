public class EncapsulatedAccount {

    //Attributes
    private String accountNumber;
    private String accountOwner;
    private double balance;

    //Constructors
    public EncapsulatedAccount(String accountNumber, String accountOwner, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public EncapsulatedAccount(String accountNumber) {
        this(accountNumber, null, 0);
        System.out.println("");
    }

    public EncapsulatedAccount(String accountNumber, String accountOwner) {
        this(accountNumber, accountOwner, 0);
    }

    public EncapsulatedAccount(String accountNumber, double balance) {
        this(accountNumber, null, balance);
    }

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

    void transfer(double amount, EncapsulatedAccount targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    void printBalance() {
        System.out.println("Balance: R$" + balance);
    }

    //Getters and Setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }
}

