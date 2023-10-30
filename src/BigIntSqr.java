import java.math.BigInteger;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Math.*;

public class BigIntSqr {
    public static void main(String[] args) {
        long g = MAX_VALUE;
        BigInteger b = BigInteger.valueOf(g);
        BigInteger result = b.multiply(b);


        System.out.println(result);
    }
}

