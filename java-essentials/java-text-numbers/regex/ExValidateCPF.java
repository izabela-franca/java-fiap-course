public class ExValidateCPF {

    public static void main(String[] args) {

        System.out.println(validateCPF("405.584.269-12"));
        System.out.println(validateCPF("405 584 269 12"));
        System.out.println(validateCPF("40558426912"));

    }

    private static boolean validateCPF (String cpf){
        return cpf.matches("\\d{3}([.\\s])?\\d{3}([.\\s])?\\d{3}([-\\s])?\\d{2}");
    }
}
