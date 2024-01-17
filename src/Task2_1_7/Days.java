package Task2_1_7;


public class Days {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day.getRusName() + " is weekend: " + day.isWeekend());
        }
    }

    enum Day {

        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String rusName;

        Day(String rusName) {
            this.rusName = rusName;
        }

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public String getRusName() {
            return rusName;
        }

    }
}
