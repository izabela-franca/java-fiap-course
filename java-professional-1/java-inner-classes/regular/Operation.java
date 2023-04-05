package regular;

//Outer Class
public class Operation {

    private final int value1;
    private final int value2;

    public Operation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    //Delega o método execute para outro classe
    public int execute() {
        Sum sum = new Sum();
        return sum.calculate();     //Não há necessidade de colocar parâmetros, pois por ser Inner class, tem acesso
    }

    //Regular Inner Class
    private class Sum {
        public int calculate() {
            return value1 + value2;
        }
    }
}
