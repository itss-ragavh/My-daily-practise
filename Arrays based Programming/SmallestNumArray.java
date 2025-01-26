import java.util.Arrays;
class SmallestNumArray
{
	public static int solve(int[]a) 
	{
		int smallest=a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) 
	{
		System.out.println("Find the smallest in arrays");
		int[]a={9,2,3,0,5,6};
		System.out.println(Arrays.toString(a));
		int ans=solve(a);
		System.out.println("The smallest number in the Arrays is: "+ans);
	}
}
