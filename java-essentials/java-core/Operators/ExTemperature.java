public class ExTemperature {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Temperatura em Fahrenheit: ");
        double tf = Double.parseDouble(scanner.nextLine());
        double tc = (tf - 32) / 9 * 5;

        System.out.println("Temperatura em Celius: " + tc);
    }
}
