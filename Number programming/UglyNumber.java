import java.util.Scanner;


 // An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.

public class UglyNumber {
   static Scanner sc=new Scanner(System.in) ;
   public static void main(String[] args) {
    System.out.print("Enter the number :");
    int n=sc.nextInt();
    if(isUgly(n)){
        System.out.println("The given mumber is Ugly number :"+n);
    }
    else{
        System.out.println("nope the given number is not an Ugly number :"+n);
    }
   }

    public static boolean isUgly(int n) {
     if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}