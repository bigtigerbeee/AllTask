package Task1_5_7;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 6};
        int[] mergedAndSortedArray = mergeAndSort(firstArray, secondArray);
        System.out.println(Arrays.toString(mergedAndSortedArray));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int firstLength = firstArray.length;
        int secondLength = secondArray.length;
        int[] mergedArray = new int[firstLength + secondLength];
        for (int i = 0; i < firstLength; i++) {
            mergedArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondLength; i++) {
            mergedArray[firstLength + i] = secondArray[i];
        }
        Arrays.sort(mergedArray);
        return mergedArray;
    }
}

