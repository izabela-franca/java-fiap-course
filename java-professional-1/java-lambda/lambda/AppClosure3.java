package lambda;

public class AppClosure3 {

    public static void main(String[] args) {

        NumberProvider p = new NumberProvider();
        p.setN(5);
        var n1 = p.provide();

        p.setN(10);
        var n2 = p.provide();

        System.out.println(n1.getNumber());
        System.out.println(n2.getNumber());     //O valor do atributo será usado na chamada, pois o mesmo atributo é compartilhado por todas as lambda expressions

        //Para resolvermos isso devemos eliminar a dependência do atributo, ou seja, criar uma variável local
    }
}
