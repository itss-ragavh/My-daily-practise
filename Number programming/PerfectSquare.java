import java.util.*;

class PerfectSquare {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        // Take the square root of the number and check if it's an integer
        double sqrt = Math.sqrt(n);
        
        // If the square of the integer part of sqrt equals n, it's a perfect square
        if (sqrt == (int) sqrt) {
            System.out.println("The given number is a perfect square.");
        } else {
            System.out.println("The given number is not a perfect square.");
        }
    }
}
