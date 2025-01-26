import java.util.Arrays;
class Sort 
{
	public static void main(String[] args) 
	{
		int[]a={5,2,8,1,3};
		int[]b={};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		bubbleSort(b);
		
	}
	public static void bubbleSort(int[]a){
		if (a.length==0)
		{
			System.out.println("Arrays is empty");
			return;
		}
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
		System.out.println(Arrays.toString(a));
	}
}
/*
Sort an Array Without Using Built-in Methods
Input: [5, 2, 8, 1, 3]
Output: [1, 2, 3, 5, 8]
*/