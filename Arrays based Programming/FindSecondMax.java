import java.util.Arrays;
class  FindSecondMax
{
	public static void main(String[] args) 
	{
		System.out.println("\nThe Given Array is:");
		int[]a={1,3,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		int res=secMax(a);
		System.out.println("\n\tThe Second largest Element in Array is: "+res);
	}
	public static int secMax(int[]a)
	{
		if (a.length==0)
		{
			return 0;
		}
		int max=a[0];
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
			 else if (nums[i] > secondMax && nums[i] < max)
			{
                secondMax = nums[i];
			}
		}
		return max;
	}
}
