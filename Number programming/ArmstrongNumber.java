import java.util.*;
public class ArmstrongNumber {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int sum=0,temp=n;
        String num=String.valueOf(n);
        int count=num.length();
        while (n!=0) {
            int digit= n%10;
            sum += Math.pow(digit, count);  
            n/=10;
        }
        if (sum==temp) {
            System.out.println("The given number "+temp+" is armstrong number");
        }
        else
        {
            System.out.println("The given number "+temp+" is not an armstrong number");
        }
    }
}