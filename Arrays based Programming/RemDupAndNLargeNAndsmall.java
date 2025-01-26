import java.util.Arrays;
class RemDup
{
	public static void main(String[] args) 
	{
		int []a={2,1,2,0,4,6,1,7};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		int[]res=BubbleSort(a);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(res));	
	}
	public static int[] BubbleSort(int[]a)
	{
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=0;j<a.length-1 ;j++ )
			{
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}
