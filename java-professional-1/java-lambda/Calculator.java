public class Calculator {

    private int mult;

    int calcular(int x, int y) {
        mult = 3;   //Está sendo usado como um atributo, por isso não é preciso ser final
        mult = 2;
        Operation operation = (n1, n2) -> (n1 + n2) * mult;
        return operation.calculate(x, y);
    }
}
