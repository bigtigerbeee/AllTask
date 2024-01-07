package Task1_6_8;

public class parseAndPrintNumber {
    public static void main(String[] args) {
        String str = String.valueOf(10);
        parseAndPrintNumber(str);
    }
    public static void parseAndPrintNumber(String str){
        int results = Integer.parseInt(str) / 2;
        System.out.println(results);
    }
}
