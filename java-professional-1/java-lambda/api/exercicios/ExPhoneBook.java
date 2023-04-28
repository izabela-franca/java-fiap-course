package api.exercicios;

public class ExPhoneBook {

    public static void main(String[] args) {

        var c = new PhoneBook();
        String phone = c.findByname("vilma").orElseThrow(IllegalArgumentException::new);
        System.out.println(phone);

        //Outra forma de ser implementado
        c.findByname("izabela").ifPresentOrElse(
                System.out::println,
                () -> {throw new IllegalArgumentException();}
        );
    }
}
