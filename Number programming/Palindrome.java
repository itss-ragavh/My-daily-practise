import java.util.*;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		int temp=n,rev=0;
		while (n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println((temp==rev)? "Yes the given number is Palindrome ":"The Given number is not Palindrome");
	}
}
