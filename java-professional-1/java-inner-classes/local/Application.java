package local;

public class Application {

    //Local Inner Class: é uma classe criada dentro de um método
    public void greet() {
        class Greeter {
            public void sayHi() {
                System.out.println("Hi!");
            }
        }

        //Para Local Inner Classes é necessário instanciar a classe e chamar o método
        Greeter greeter = new Greeter();
        greeter.sayHi();
    }
}
