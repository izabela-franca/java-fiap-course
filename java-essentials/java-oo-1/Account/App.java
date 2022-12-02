public class App {

    public static void main(String[] args) {

        //Creating objects;
        Account a1 = new Account();
        Account a2 = new Account();

        //Accessing objects
        a1.accountNumber = "1234-5";
        a1.accountOwner = "Izabela";
        a1.balance = 100.0;

        a2.accountNumber = "5432-1";
        a2.accountOwner = "Diego";
        a2.balance = 200.0;

        System.out.println(a1.accountNumber);
        System.out.println(a1.accountOwner);
        System.out.println(a1.balance);
        System.out.println("--------------------");
        System.out.println(a2.accountNumber);
        System.out.println(a2.accountOwner);
        System.out.println(a2.balance);
    }
}
