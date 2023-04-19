package interfaces;

public class AppRunnable {

    public static void main(String[] args) {

        execute(() -> System.out.println("Java!"));
    }

    private static void execute(Runnable runnable) {
        runnable.run();
    }
}
