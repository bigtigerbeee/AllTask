package Task1_3_8;

public class CharEddition {
    public static void main(String[] args) {
       /* CharExpression expression = new CharExpression();
       int result = expression.charExpression(15, 20, 100, 12, 13, 14, 15);
        System.out.println(result);*/
        int result = charExpression(15);
        System.out.println(result);
    }

    public static char charExpression(int a) {
        return (char) ('q' + a);
    }
}

