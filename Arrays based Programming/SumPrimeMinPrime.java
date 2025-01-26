import java.util.*;

class SumPrimeMinPrime {
    public static void main(String[] args) {
        int[] a = {10, 16, 6, 8, 3};
        String[] ans = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = getNumber(a[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(ans));
    }

    public static String getNumber(int num) {
        int sum = 0;
        int min = Integer.MAX_VALUE; 

        for (int i = 2; i <= num; i++) {
            if (Prime(i)) {
                sum += i;
                if (i < min) {
                    min = i; 
                }
            }
        }

       
        if (min == Integer.MAX_VALUE) {
            min = 0; 
        }

        return sum + ":" + min;
    }

    public static boolean Prime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime
            }
        }
        return true; // Is prime
    }
}
