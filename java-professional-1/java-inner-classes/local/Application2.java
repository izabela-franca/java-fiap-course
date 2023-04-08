package local;

public class Application2 {

    private final String message = "Hi";

    public void greet(String name) {
        //Variáveis precisam ser final (ou não alteradas) para serem acessíveis pela Local Inner Class
        String upperName = name.toUpperCase();

        class Greeter {
            public void sayHi() {
                System.out.format("%s, %s!", message, upperName);   //Conseguem acessar atributos da sua Outer Class. E se forem Inner Classes do tipo local, conseguem acessar as variáveis locais do método
            }
        }

        Greeter greeter = new Greeter();
        greeter.sayHi();
    }
}
