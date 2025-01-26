import java.util.Arrays;
class LargestNumArray
{
	public static int solve(int[]a) 
	{
		int Largest=a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]>Largest)
			{
				Largest=a[i];
			}
		}
		return Largest;
	}
	public static void main(String[] args) 
	{
		System.out.println("Find the Largest in arrays");
		int[]a={9,2,3,0,5,6};
		System.out.println(Arrays.toString(a));
		int ans=solve(a);
		System.out.println("The Largest number in the Arrays is: "+ans);
	}
}
