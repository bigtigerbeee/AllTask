package Task1_5_5;

import java.util.Arrays;

public class MiddleOfArray1 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 17};
        getArrayMiddle(numbers);
        System.out.println(Arrays.toString(getArrayMiddle(numbers)));


    }

    public static int[] getArrayMiddle(int[] numbers) {
        int left = (numbers.length - 1) / 2;
        int right = numbers.length == 0 ? 0 : left + 2 - numbers.length % 2;
        return Arrays.copyOfRange(numbers, left, right);
    }
}

