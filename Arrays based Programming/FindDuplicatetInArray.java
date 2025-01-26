import java.util.Arrays;
class FindDuplicatetInArray 
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,3,2,1,1,0};
		System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++)
		{
			int count=1;
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					count++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			/*
			if (a[i]!=Integer.MAX_VALUE && count>1||count==0)
			{
				System.out.print(a[i]+" ");
			} */
		}
		System.out.print("Unique Elements: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] != Integer.MAX_VALUE) {
                System.out.print(a[i] + " ");
			}
		}
	}
}
