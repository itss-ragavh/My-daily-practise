import java.util.Arrays;
class  SwappingElements
{
	public static int[] solve(int[]a) 
	{
		int i=0,r=a.length-1;
		while (i<r)
		{
			if (a[i]==0&&a[r]==1)
			{
				int temp=a[i];
				a[i]=a[r];
				a[r]=temp;
				i++;
				r--;
			}
			if (a[i]==1)
			{
				i++;
			}
			if (a[r]==0)
			{
				r--;
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int[]a={1,0,0,1,1,0,1,0};
		System.out.println("Before sorting the arrays");
		System.out.println(Arrays.toString(a));
		int res[]=solve(a);
		System.out.println("After Sorting the arrays"); //ouput;in[]res{1,1,1,1,0,0,0,0};
		System.out.println(Arrays.toString(res));
	}
}
