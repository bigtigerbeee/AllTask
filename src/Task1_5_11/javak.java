package Task1_5_11;

import java.util.Arrays;

public class javak {
    public static void main(String[] args) {
       int [] arr1={1,3,7,5};
       int [] arr2 = {8,4,2,4};
       mergAndSoft(arr1,arr2);
        System.out.println(Arrays.toString(mergAndSoft(arr1,arr2)));
    }
    public static int[] mergAndSoft(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, r = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[r] = arr1[i];
                i++;
            } else {
                result[r] = arr2[j];
                j++;
            }
            r++;
        }
        if (i < arr1.length) {
            System.arraycopy(arr1, i, result, r, (arr1.length - i));
        }
        if (j < arr2.length) {
            System.arraycopy(arr2, j, result, r, (arr2.length - j));
        }
        return result;
    }
}
