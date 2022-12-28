package enums;

public class ExDaysOfTheWeek {

    public enum DayOfTheWeek {
        SUNDAY(null),
        SATURDAY(SUNDAY),
        FRIDAY(SATURDAY),
        THURSDAY(FRIDAY),
        WEDNESDAY(THURSDAY),
        TUESDAY(WEDNESDAY),
        MONDAY(TUESDAY);


        private final DayOfTheWeek next;

        DayOfTheWeek(DayOfTheWeek next) {
            this.next = next;
        }

        public DayOfTheWeek next() {
            return this.next == null ? MONDAY : this.next;
        }
    }

    public static void main(String[] args) {
        System.out.println(DayOfTheWeek.MONDAY.next());
        System.out.println(DayOfTheWeek.SUNDAY.next());
    }
}
