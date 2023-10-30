import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {
        int [] rename = {1,3,5,6,9,11,24};
        int start1 = 4;
        int end1 = 10;
        System.out.println(Arrays.toString( getSubArrayBetween(rename,start1,end1)));

    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int a = 0;
        int[] result = new int[a];
        for (int b = 0; b <= numbers.length; b++) {
            if (numbers[b] >= start && numbers[b] <= end) {
                result[a] = numbers[b];
            }
        }
        return result;
    }
}

