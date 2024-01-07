package Task1_5_12;

public class PrintOddNumbers {

        public static void main(String[] args) {
            int[] array = {1, 8, 7, 11, 50, 121};
            printOddNumbers(array);
        }

        public static void printOddNumbers(int[] array) {
            StringBuilder result = new StringBuilder();

            for (int number : array) {
                if (number % 2 != 0) {
                    result.append(number).append(", ");
                }
            }

            if (result.length() > 0) {
                result.delete(result.length() - 2, result.length());
            }

            System.out.println(result);
        }
    }


