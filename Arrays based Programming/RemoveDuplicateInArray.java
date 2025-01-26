import java.util.Arrays;
class RemoveDuplicateInArray
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,2,3,1,5,4};
		System.out.println(Arrays.toString(a));
		int[] b=new int[a.length];
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					a[j]=Integer.MAX_VALUE;
				}
			}
			if (a[i]!=Integer.MAX_VALUE)
			{
				b[i]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));	
	}
}
