import java.util.*;

class UniqueElement {
    public static void main(String[] args) {
        int[] a = {2, 2, 1};
        int[] b = {3, 1, 2, 2, 1};
        
        System.out.println("Unique element in a: " + findUnique(a));
        System.out.println("Unique element in b: " + findUnique(b));
    }

    // Method to find the unique element using sorting
    public static int findUnique(int[] arr) {
        Arrays.sort(arr);  // Sort the array
        
        // Check adjacent elements after sorting
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                // If current element doesn't match the next element, it's unique
                return arr[i];  
            }
            // If both are equal, skip the next one as it's part of the pair
            i++;
        }
        
        // If the last element is the unique one
        return arr[arr.length - 1];
    }
}
