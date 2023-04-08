package anonymous;

//Em situações, em que não precisamos da classe (ou seja, não instanciaremos ela em outro lugar), podemos omitir ou nome desta, tornando-a uma Anonymous Inner Class

public class AnonymousInnerClassApp1 {

    public static void main(String[] args) {

        //Isso seria instanciar uma classe
        //Message message = new Message();
        
        //Anonymous Inner Class
        Message message = new Message() {   //Não está instanciando uma interface, mas sim criando uma classe anônima que implementa um interface
            @Override
            public String get() {
                return "Hi!";
            }
        };

        //Outra classe anônima
        Message message2 = new Message() {
            @Override
            public String get() {
                return "Bye!";
            }
        };

        System.out.println(message.get());
        System.out.println(message2.get());
    }
}
