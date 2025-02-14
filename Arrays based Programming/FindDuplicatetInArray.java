import java.util.Arrays;
class FindDuplicatetInArray 
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,3,2,1,1,0};
		System.out.println(Arrays.toString(a));
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
				System.out.print(a[i]+" ");
			} 
		}
		System.out.println();
		System.out.print("Unique Elements: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] != Integer.MAX_VALUE) {
                System.out.print(a[i] + " ");
			}
		}
	}
}
