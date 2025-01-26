import java.util.*;
class  Anagram
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the String s1: ");
		String s1=sc.nextLine();
		System.out.print("Enter the String s2: ");
		String s2=sc.nextLine();
		if (isAnagram(s1,s2))
		{
			System.out.println("-----------------------------------------------------"); 
			System.out.println("The Given Strings are Anagram");
		}
		else{
			System.out.println("-----------------------------------------------------"); 
			System.out.println("The Given Strings are Not An Anagram");
		}
	}
	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		char[]a=s1.toCharArray();
		char[]b=s2.toCharArray();
		System.out.println("Before Sort");
		System.out.println(a);
		System.out.println(b);
		Arrays.sort(a);
		Arrays.sort(b);
		s1=new String(a);
		s2=new String(b);
		System.out.println("After Sort");
		System.out.println(a);
		System.out.println(b);
		return s1.equals(s2);
	} 
}
