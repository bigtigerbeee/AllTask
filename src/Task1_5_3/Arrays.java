package Task1_5_3;

public class Arrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 7};
        printArray(array1);


    }

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1)

                System.out.print(numbers[i] + ",");
            else {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("]");

    }

}
