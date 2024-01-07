package Task1_6_10;

public class parseAndSqrt {
    public static void main(String[] args) {
        String number = "64";
        long result = parseAndSqrt(number);
        System.out.println(result);
    }
    public static long parseAndSqrt(String number) {
        long parseNumber = Long.parseLong(number);
        double sqrt = Math.sqrt(parseNumber);
        long roundedSqrt = Math.round(sqrt);
        return roundedSqrt;
    }
}
