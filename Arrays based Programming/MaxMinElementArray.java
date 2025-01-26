import java.util.Arrays;
class MaxMinElementArray 
{
	public static void main(String[] args) 
	{
		System.out.println("\nThe Array before finding its max and min element in it: ");
		int[]a={2,3,4,9,1};
		System.out.println("\n\t\t"+Arrays.toString(a));
		int[] res1= MaxMin(a);
		System.out.println("\nThe Array After finding its max and min element in it: ");
		System.out.println("\n\t\t"+Arrays.toString(res1));
		System.out.println("---------------------------------------------------------");
		System.out.println("\nThe Array before finding its max and min element in it: ");
		int[]b={};
		System.out.println("\n\t\t"+Arrays.toString(b));
		int[] res2= MaxMin(b);
		System.out.println("\nThe Array After finding its max and min element in it: ");
		System.out.println("\n\t\t"+Arrays.toString(res2));
	}
	
	public static int[] MaxMin(int[]x)
	{
		if (x.length == 0) 
		{
            return new int[0]; 
		}
		
		int max=x[0];
		int min=x[0];
		int index=0;
		for (int i=0;i<x.length;i++)
		 {
			if (x[i]>max)
			{
				max=x[i];
				index++;
			}
		 }
		for (int i=0;i<x.length;i++)
		{
			if (x[i]<min)
			{
				min=x[i];
				index++;
			}
		}
		int[] res={max,min};		
		return res;
	}
}
