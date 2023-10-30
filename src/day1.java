import java.time.DayOfWeek;
import java.time.MonthDay;

public class day1 {
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
