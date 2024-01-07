package Task1_5_6;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [] reverseResult = reverse(array);
        System.out.println("reverseResult = " + Arrays.toString(reverseResult));
    }


    static int[] reverse(int[] array) {
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[array.length - 1 - i] = array[i];


        }


        return newarray;
    }
}
