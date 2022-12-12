package exercises.accout2;

public class CheckingAccount extends Account{

    //Attributes
    private double rate;

    //Constructor
    public CheckingAccount(double rate) {
        super(100);
        this.rate = rate;
    }

    //Method
    @Override
    double rate() {
        return rate;
    }
}
