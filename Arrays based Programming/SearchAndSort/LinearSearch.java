import java.util.*;
class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int[]a={2,3,4,5,6,7,22,8};
		System.out.print("\n\tEnter the Key number :");
		int key=sc.nextInt();
		String res=linearSearch(a,key);
		System.out.println("\n\t\tThe Number is "+res+" in\n\t\t\t\t"+Arrays.toString(a));
	}
	public static String linearSearch(int[]a,int key)
	{
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==key)
			{
				return "present";
			}
		}
		return "Not-present";
	}
}
