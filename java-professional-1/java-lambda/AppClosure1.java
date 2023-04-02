public class AppClosure1 {

    public static void main(String[] args) {

        int mult = 2;

        //Expressão agora depende de uma variável fora dela (desde que seja final)
        Operation sum = (n1, n2) -> (n1 + n2) * 2;
        System.out.println(sum.calculate(5,4));
    }
}
