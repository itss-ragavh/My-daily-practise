import java.util.Scanner;

public class ReverseNum {
    public static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;  
        x = Math.abs(x);  
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;  
            x /= 10;  

            if (reversed > Integer.MAX_VALUE / 10 || 
                (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  
            }
            if (reversed < Integer.MIN_VALUE / 10 || 
                (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  
            }

            reversed = reversed * 10 + digit; 
        }

        return sign * reversed;  
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println(reverse(n));  
    }
}
