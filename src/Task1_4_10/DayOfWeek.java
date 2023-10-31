package Task1_4_10;

public class DayOfWeek {
    public static void main(String[] args) {
        boolean result=isWeekend("mondey");
        System.out.println(result);

    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Monday":
                return false;

            case "Tuesday":
                return false;

            case "Wednesday":
                return false;

            case "Thursday":
                return false;

            case "Friday":
                return false;

            case "Saturday":
                return true;

            case "Sunday":
                return true;
            default:
                return false;


        }

    }
}

