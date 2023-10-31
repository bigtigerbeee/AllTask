package Task1_2_14;

import java.math.BigInteger;

import static java.lang.Long.MAX_VALUE;

public class MaxLong {


    public static void main(String[] args) {
        long g = MAX_VALUE;
        BigInteger b = BigInteger.valueOf(g);
        BigInteger result = b.multiply(b);


        System.out.println(result);
    }
}
