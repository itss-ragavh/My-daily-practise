//Two Sum: Given an array [2, 7, 11, 15] and a target 9, return the indices of the two numbers that add up to the target.
import java.util.*;
class  SumElementFindTarget
{
	
	public static void main(String[] args) 
	{																		
		int []a={2,7,11,15};
		int target=9;	
		System.out.print("\n\n\tThe given Array is: ");
		System.out.println(Arrays.toString(a));
		System.out.println("\n\n\tThe given  Target is: "+target);
		System.out.print("\n\t\tThe addition of number which gives target number  is: ");
		SumFinTarget(a,target);
	}							
	public static void SumFinTarget(int[]a,int target)
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]+a[j]==target)
				{
					System.out.print(a[i]+","+ a[j]+"\n");
				}
			}
		}
	}
}
