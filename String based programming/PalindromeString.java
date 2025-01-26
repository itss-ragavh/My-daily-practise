import java.util.Scanner;
class PalindromeString
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter the string");
		String a=sc.nextLine();
		String res=palindrome(a);
		System.out.println(res);
	}
	public static String palindrome(String a)
	{
		String b="";
		for (int i=a.length()-1;i>=0;i--)
		{
			b+=a.charAt(i);
		}
		if (a.equalsIgnoreCase(b))	//not case sentive{for make it case senstive use (equals)-instead-(equalsIgnoreCase)} 
		{
			return "Palindrome";
		}
		else
			return "Not a Palindrome";
	}
}