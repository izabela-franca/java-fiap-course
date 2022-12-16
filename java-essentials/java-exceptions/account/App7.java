package account;

public class App7 {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        try {
            accountService.createAndWithdraw("1234", 1200);
        } catch (ServiceException e ) {
            e.printStackTrace();
        }

    }
}
