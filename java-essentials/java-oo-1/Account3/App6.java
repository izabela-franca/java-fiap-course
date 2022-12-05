public class App6 {

    public static void main(String[] args) {

        var account1 = new IdGeneratedAccount("Izabela");
        var account2 = new IdGeneratedAccount("Diego");

        System.out.println(account1.getAccountNumber());
        System.out.println(account2.getAccountNumber());

        //Static method being called
        int id = IdGeneratedAccount.getCurrentId();
        System.out.println(id);
    }
}
