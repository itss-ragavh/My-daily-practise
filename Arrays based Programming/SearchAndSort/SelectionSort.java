import java.util.Arrays;
class  SelectionSort
{
	public static void main(String[] args) 
	{
		int[]a={12,2,3,40,8,0,-1,9};
		System.out.println("\tArray Before Sorting \n\t\t"+Arrays.toString(a));
		for (int i=0;i<a.length-1;i++ )
		{
			int s=i;
			for (int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[s])
				{
					s=j;
				}
			}
			if (s!=i)
			{
				int temp=a[i];
				a[i]=a[s];
				a[s]=temp;
			}
		}
		System.out.println("\tArray After Sorting \n\t\t"+Arrays.toString(a));
	}
}
