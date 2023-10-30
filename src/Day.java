

public class Day {
    public static void main(String[] args) {
        boolean result=isWeekend("Thursday");
        System.out.println(result);

    }
    public static boolean isWeekend(String weekday) {
        if (weekday == "Monday") {
            return false;
        } else if (weekday == "Tuesday") {
            return false;
        } else if (weekday == "Wednesday") {
            return false;
        } else if (weekday == "Thursday") {
            return false;
        } else if (weekday == "Friday") {
            return false;
        } else if (weekday == "Saturday") {
            return true;
        } else return weekday == "Sunday";
    }

}



