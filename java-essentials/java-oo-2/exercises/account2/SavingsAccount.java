package exercises.accout2;

public class SavingsAccount extends Account{

    //Constructor
    public SavingsAccount(double balance) {
        super(balance);
    }

    //Methods
    @Override
    double rate() {
        return 0.05;
    }
}
