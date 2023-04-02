public class NumberProvider {

    private int n;

    public void setN(int n){
        this.n = n;
    }

    public Number provide() {
        int v = n;  //criando uma variável local para corrigir o problema encontrado no AppClosure3
        return () -> v;
    }

    @FunctionalInterface
    public interface Number {
        int getNumber();
    }
}
