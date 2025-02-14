import java.util.Scanner;

public class XylemPholem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Extract first and last digit
        int lastDigit = num % 10;
        int firstDigit = num;

        // Calculate first digit
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Calculate sum of remaining digits
        int p = 0;
        int tempNum = num / 10; // Remove last digit

        while (tempNum > 0) {
            p += tempNum % 10;
            tempNum /= 10;
        }

        // Calculate the sum of first and last digits
        int firstLastSum = firstDigit + lastDigit;

        // Check the condition
        if (firstLastSum == p) {
            System.out.println("it's xylem no");
        } else {
            System.out.println("phloem no");
        }

        scanner.close();
    }
}
/*
import java.util.*;
public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello World");
    
    int num=1031;
    if(isXyelem(num)){
    System.out.println("Its a Xylem num");
    }else{System.out.println("Its not -Xylem");}
    
    
  }
  public static boolean isXyelem(int n){
  
  		int sumIN=0,sumOUT=0;
        
  		String str = Integer.toString(n);
    	for(int i=0;i<str.length();i++){
        	if(i!=0&&i!=str.length()-1){
        	int num = str.charAt(i)-'0';	
            sumIN+=num;
            }
        }
        sumOUT=(str.charAt(0)-'0')+(str.charAt(str.length()-1)-'0');
        
        return sumIN==sumOUT;
        
  }
}
*/