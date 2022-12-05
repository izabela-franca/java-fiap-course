public class IdGeneratedAccount {

    //Constant
    private static final int INITIAL_VALUE = 1;

    //Attributes
    private String accountNumber;
    private String accountOwner;
    private double balance;

    //Static attribute
    private static int currentId;

    //Static block
    static {
        currentId = INITIAL_VALUE;
    }

    //Constructors
    public IdGeneratedAccount(String accountOwner) {
        this.accountNumber = "000" + currentId++;
        this.accountOwner = accountOwner;
        this.balance = 0.0;
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

    boolean withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Saque realizado com sucesso!");
            return  true;
        }
        System.out.println("Ops, saque inválido!");
        return  false;
    }

    void transfer(double amount, IdGeneratedAccount targetAccount) {
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

    //Static method
    public static int getCurrentId() {
        return currentId;
    }
}
