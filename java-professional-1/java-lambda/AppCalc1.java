/*
Quando temos uma classe anônima de uma interface que implementa um método, pode usar expressão Lambda
Estrutura: (parâmetros) -> {corpo}
NÃO podemos usar como expressões Lambdas implemetações de Interfaces que tenham mais um método (Interface Funcional = Interface com apenas uma método)
*/

public class AppCalc1 {

    public static void main(String[] args) {


        Operation sum = new Operation() {
            @Override
            public int calculate(int n1, int n2) {
                return n1 + n2;
            }
        };

        //Lambda
        Operation mult = (int n1, int n2) -> {
            return n1 * n2;
        };

        run(sum);
        run(mult);
    }

    private static void run(Operation operation) {
        int r = operation.calculate(5, 4);
        System.out.println(r);
    }
}
