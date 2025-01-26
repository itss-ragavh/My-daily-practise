import java.util.*;
public class FIzzBuzz {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the starting range :");
        int start=sc.nextInt();
        System.out.print("Enter the End of the range");
        int End=sc.nextInt();
        for (int i =start ; i <=End; i++) {
            if (i%3==0&&i%5==0) {
                System.out.println("FizzBuzz");
            }
            else if (i%3==0) {
                System.out.println("Fizz");
            }
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}