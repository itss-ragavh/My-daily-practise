import java.util.*;
class SecondLargeArr 
{

    public static String findSecondLargest(int[] arr) {
        if (arr.length < 2) {
        return "The array has only one element ,So it has no second largest number\n";
        }

        Arrays.sort(arr);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i]+" -its is  the second largest number in tha array\n";
            }
        }

        return "The array has no second largest number\n";
    }

    public static void main(String[] args) {
		System.out.println("\n\n");
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest: " + findSecondLargest(arr1)); // Output: 34

        int[] arr2 = {10, 5, 10};
        System.out.println("Second largest: " + findSecondLargest(arr2)); // Output: 5

        int[] arr3 = {10, 10, 10};
        System.out.println("Second largest: " + findSecondLargest(arr3)); // Output: -1

        int[] arr4 = {1};
        System.out.println("Second largest: " + findSecondLargest(arr4)); // Output: -1
    }
}

