package Task1_3_2;

public class CharExpression {
    public void main(String[] args) {
       int result = charExpression(15, 20, 100, 12, 13, 14, 15);
       System.out.println(result);
    }

    public  char charExpression(int... a) {

        char c = 'f';

        for (int i : a) {
            c = (char) ('q' + i);

        }
        return c;
    }
}


