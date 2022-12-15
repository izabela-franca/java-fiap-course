package account;

public class App3 {
                                            //Checked Exception
    public static void main(String[] args) throws Exception{

        Account3 a = new Account3("1234");
        a.deposit(500);
        System.out.println(a);

        a.withdraw(750);
        System.out.println(a);

        System.out.println("Success");
    }
}