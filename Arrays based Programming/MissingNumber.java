import java.util.Arrays;

class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 8};
        System.out.println(Arrays.toString(a));
        String res = solve(a);
        System.out.println(res);

        int[] b = {1, 2, 3, 10};
        System.out.println(Arrays.toString(b));
        String res1 = solve(b);
        System.out.println(res1);
    }

    public static String solve(int[] x) {
        StringBuilder ans = new StringBuilder(); // Use StringBuilder for better performance
        String temp = "No Missing Numbers";
        int j = 1; // Start checking from 1
        boolean flag = false; // Flag to track if there are missing numbers

        for (int i = 0; i < x.length; ) {
            if (x[i] != j) {
                ans.append(j).append(" "); // If the number is missing, add it to the result
                flag = true; // Set flag to true as we found a missing number
            } else {
                i++; // Move to the next element in the array
            }
            j++; // Always move to the next number
        }

        // Check for any remaining missing numbers after the loop
        while (j <= x[x.length - 1]) {
            ans.append(j).append(" "); // Add remaining missing numbers
            j++;
            flag = true; // Still found missing numbers
        }

        if (flag) {
            return ans.toString().trim(); // Return the result, trimmed of trailing spaces
        }
        return temp; // Return the default message if no numbers are missing
    }
}
