import java.util.*;
class  BubbleSort
{
	public static void main(String[] args) 
	{
		int []a={10,23,4,5,89,0,-4,1,2,3,};
		System.out.println("\t\t\tThe before sorting");
		System.out.println("\t\t\t"+Arrays.toString(a));
		BubbleSort(a);
	}
	public static void BubbleSort(int[]a)
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
		System.out.println("\t\t\tThe after sorting");
		System.out.println("\t\t\t"+Arrays.toString(a));
	}
}
