package lambda;

public class Calculator {

    private int mult;

    int calcular(int x, int y) {
        mult = 2;
        Operation operation = (n1, n2) -> (n1 + n2) * mult; //definindo a expressão
        mult = 3;   //Está sendo usado como um atributo, por isso não é preciso ser final
        return operation.calculate(x, y);   //executando a expressão - será utilizado o mult = 3
    }
}
