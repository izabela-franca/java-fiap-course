package enums;

public class ExCalculate {

    public interface Calculator {
        double calculate(double n1, double n2);
    }

    public enum Operation implements Calculator {
        SUM( '+') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 + n2;
            }
        },
        SUBTRACT('-') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 - n2;
            }
        },
        MULTIPLY('*') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 * n2;
            }
        },
        DIVIDE('/') {
            @Override
            public double calculate(double n1, double n2) {
                return n1 / n2;
            }
        };

        private final char symbol;

        Operation(char symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return String.valueOf(symbol);
        }
    }

    public static void main(String[] args) {
        System.out.println(Operation.SUM);
        System.out.println(Operation.MULTIPLY.calculate(4, 3));
        System.out.println(Operation.SUBTRACT.calculate(4, 3));
    }
}
