import java.util.Arrays;
class  MergingArrays
{
	public static int[] merge(int[]a,int[]b)
	{
		int[]x=new int[a.length+b.length];
		for (int i=0,m=0,n=0;i<x.length;i++ )
		{
			if (m<a.length)
			{
				x[i]=a[m];
				m++;
			}
			else if (n<b.length)
			{
				x[i]=b[n];
				n++;
			}
		}
		return x;
	}
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,5};	
		int[]b={6,7,8,9,10};
		System.out.println("Before Merging of Two Arrays");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("After Merging of Two Arrays");
		int[]res=merge(a,b);
		System.out.println(Arrays.toString(res));
	}
}
