package sets;

import java.util.Set;

public class SetApp2 {

    public static void main(String[] args) {

        SetsAccount a1 = new SetsAccount("123", 100);
        SetsAccount a2 = new SetsAccount("456", 200);

        var accounts = Set.of(a1, a2);  //immutable

        for (SetsAccount account :accounts) {
            System.out.println(account);
        }
    }
}
