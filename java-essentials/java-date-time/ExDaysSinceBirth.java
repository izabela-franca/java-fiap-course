import java.time.LocalDate;
import java.time.Period;

public class ExDaysSinceBirth {

    public static void main(String[] args) {

        var birthDate = LocalDate.of(1991, 05, 03);
        var today = LocalDate.now();

        Period period = Period.between(birthDate, today);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
