import java.util.*;

class StrongNumber {
    static Scanner sc = new Scanner(System.in);
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        int temp = num;  // Store the original number
        int sum = 0;

        
        while (temp > 0) {
            int digit = temp % 10;  // Get the last digit
            sum += factorial(digit);  // Add the factorial of the digit to the sum
            temp /= 10;  // Remove the last digit
        }

       
        if (sum == num) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }
}
