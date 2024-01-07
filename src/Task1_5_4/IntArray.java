package Task1_5_4;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {
        int[] rename = {1, 3,4, 5, 6, 9,10, 11, 24};
        int start1 = 4;
        int end1 = 10;
        System.out.println(Arrays.toString(getSubArrayBetween(rename, start1, end1)));

    }


    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int k = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                k++;

            }
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                result[index] = numbers[i];
                index++;

            }

        }
        return result;
    }
}
