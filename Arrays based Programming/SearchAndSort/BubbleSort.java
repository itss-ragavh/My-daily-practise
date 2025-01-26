import java.util.Arrays;
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[]a={5,7,3,1,-2,0,9};
		System.out.println("\tArray Before Sorting \n\t\t"+Arrays.toString(a));
		for (int i=0;i<a.length-1;i++ )
		{
			for (int j=0;j<a.length-1;j++ )
			{
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\tArray After Sorting \n\t\t"+Arrays.toString(a));
	}
}
