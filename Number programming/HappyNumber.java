import java.util.Scanner;

public class HappyNumber {

    public static boolean isHappy(int n) {
        int tortoise = n;  // Slow pointer
        int hare = n;      // Fast pointer
        
       
        do {
            tortoise = sumOfSquaresOfDigits(tortoise);  // Move tortoise one step
            hare = sumOfSquaresOfDigits(sumOfSquaresOfDigits(hare));  // Move hare two steps
        } while (tortoise != hare);  // Continue until the pointers meet

       
        return tortoise == 1;
    }
    public static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the number :");
        int number=sc.nextInt();
        System.out.println(isHappy(n));  // Output: true (Happy number) 19
        //System.out.println(isHappy(2));   // Output: false (Not a happy number)
    }
}
