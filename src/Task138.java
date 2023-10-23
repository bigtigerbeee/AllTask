public class Task138 {
    public static void main(String[] args) {
        isPowerOfTwo2(10);
        System.out.println(isPowerOfTwo2(10));
    }

        public static boolean isPowerOfTwo2(int a) {

            return (a > 0) && (Integer.bitCount(a) == 1);
        }
    }

