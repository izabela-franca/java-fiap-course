public class ExDayOfTheWeek {

    public static void main(String[] args) {

        int n = 1;
        String dow = switch(n) {
            case 1 -> "DOMINGO";
            case 2 -> "SEGUNDA";
            case 3 -> "TERÇA";
            case 4 -> "QUARTA";
            case 5 -> "QUINTA";
            case 6 -> "SEXTA";
            case 7 -> "SÁBADO";
            default -> "INVÁLIDO";
        };

        System.out.println(dow);
    }
}
