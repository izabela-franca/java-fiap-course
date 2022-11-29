public class ExAverageWithInput {


    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        int n = 1;
        double sum = 0.0;

        while (true) {
            System.out.print("Digite a nota " + n + ": ");

            String line = scanner.nextLine();

            if (line.isBlank()) {
                break;
            }

            sum += Double.parseDouble(line);
            n++;
        }

        double avg = sum / (n - 1);
        System.out.println(n + " nota(s) fornecidas(s)");
        System.out.println("A média é: " + avg);
    }}
