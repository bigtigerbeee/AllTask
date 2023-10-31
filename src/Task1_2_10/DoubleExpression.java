package Task1_2_10;

public class DoubleExpression {
    public class Class {
        public static boolean doubleExpression(double a, double b, double c) {
            boolean x = Math.abs((a + b) - c) < 1E-4;
            return x;
        }
    }
}
