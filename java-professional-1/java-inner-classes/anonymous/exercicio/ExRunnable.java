package anonymous.exercicio;

/*
Crie um método doIt() que recebe uma instância da interface Runnable e chama o método run();
Chame o método doIt() em vários cenários, observando o comportamento da execução;
 */

public class ExRunnable {

    public static void main(String[] args) {

        /* Opção 1: Criando variáveis
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("Hi!");
           }
       }
       */

        //Opção 2: Simplificando, sem criar variáveis
        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi!");
            }
        });

        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println(Math.random());
            }
        });
    }

    private static void doIt(Runnable runnable) {
        System.out.println("Running...");
        runnable.run();
    }
}
