package Arrays;

public class NoWithEvenDigits {
    // program to find the numbers with even digits of numbers in an array
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896, 1234, 56789};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int digitCount = 0;

            while (num > 0) {
                num /= 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of numbers with even digits: " + count);
    }
}
