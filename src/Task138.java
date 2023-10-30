public class Task138 {

    public static void main(String[] args) {
        boolean result = isPowerOfTwo(1);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int a) {

        boolean b = (a < 0) && (Integer.bitCount(a) == 1);

return false;
    }
}

