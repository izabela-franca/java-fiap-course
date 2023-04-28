package api;

import java.util.Optional;

public class AppOptional8 {

    //Má praticas:

    //Nunca devemos retonar null em um Optional
    public Optional<Integer> getNumber() {
        return Optional.empty();
    }

    //Optionals não devem ser usados como parâmetros
    public void sum (Optional<Integer> n1, Optional<Integer> n2) {

    }
}
