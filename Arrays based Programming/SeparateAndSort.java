import java.util.Arrays;

public class SeparateAndSort {
    public static int[] rearrange(int[] a) {
        int n = a.length;
        
        // Step 1: Create arrays for negatives and non-negatives
        int[] negatives = new int[n];
        int[] nonNegatives = new int[n];
        int negCount = 0;
        int nonNegCount = 0;

        // Step 2: Separate numbers
        for (int num : a) {
            if (num < 0) {
                negatives[negCount++] = num; // Store negative number and increment count
            } else {
                nonNegatives[nonNegCount++] = num; // Store non-negative number and increment count
            }
        }

        // Step 3: Sort negative numbers using bubble sort
        for (int i = 0; i < negCount - 1; i++) {
            for (int j = 0; j < negCount - 1 - i; j++) {
                if (negatives[j] > negatives[j + 1]) {
                    // Swap
                    int temp = negatives[j];
                    negatives[j] = negatives[j + 1];
                    negatives[j + 1] = temp;
                }
            }
        }

        // Step 4: Sort non-negative numbers using bubble sort
        for (int i = 0; i < nonNegCount - 1; i++) {
            for (int j = 0; j < nonNegCount - 1 - i; j++) {
                if (nonNegatives[j] > nonNegatives[j + 1]) {
                    // Swap
                    int temp = nonNegatives[j];
                    nonNegatives[j] = nonNegatives[j + 1];
                    nonNegatives[j + 1] = temp;
                }
            }
        }

        // Step 5: Combine sorted arrays into result
        int[] result = new int[n];
        int index = 0;

        // Add sorted negatives
        for (int i = 0; i < negCount; i++) {
            result[index++] = negatives[i];
        }

        // Add sorted non-negatives
        for (int i = 0; i < nonNegCount; i++) {
            result[index++] = nonNegatives[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {-8, 4, 2, -3, 4, -8, -9, 0, 2, -6};
        System.out.println("Original array: " + Arrays.toString(a));
        int[] b = rearrange(a);
        System.out.println("Rearranged array: " + Arrays.toString(b));
    }
}
