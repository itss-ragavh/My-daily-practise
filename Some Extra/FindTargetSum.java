package softsauve;

import java.util.Scanner;

public class FindTargetSum {
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			boolean flag=true;
			do {
				
				System.out.print("Enter the number (0-9) without repeating  :");
				
				String keyboard=sc.nextLine();
				
				System.out.println();
				System.out.print("Enter a number: ");
		        String number = sc.nextLine();
				
				int time = calculateTypingTime(keyboard,number);
			    System.out.println("Time to type the number: " + time);
			        
				System.out.print("Do you Need To countinue the program ? yes or no:");
				String exit=sc.nextLine();
				if(exit.equalsIgnoreCase("yes")||exit.equalsIgnoreCase("y")) {
					flag= true;
				}
				if(exit.equalsIgnoreCase("no")||exit.equalsIgnoreCase("n")) {
					flag= false;
				}
				
				
			} while (flag);
		}
		
		public static int calculateTypingTime(String keyboard, String number) {
			int currentIndex=0,targetIndex=0;
			//for(int i=0;i)
			
			return 1;
		}
		
		
		
		public static boolean CheckValidNo(String s) {
			if(s.length()!=10) {
				System.out.println("The entered number length is less than 10");
				return false;
			}
			
			 if (!s.matches("\\d+")) {
		            return false;
		        }
			
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				if(!(ch>='0'&&ch<='9')) {
					return false;
				}
				
			}
			return true;
		}
		
}
