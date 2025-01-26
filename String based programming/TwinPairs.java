import java.util.*;
class  TwinPairs
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]num={1,2,3,4,5,6,7,8,9};
		System.out.print("Enter the target number :");
		int target;
		
		while(true){
			
		target=sc.nextInt();
		
		if(target<3){
			System.out.println("Its too small Re-Enter target");
			System.out.print("Enter the target number :");
			continue;
		}
			break;
		}
		
		
		int count=0,tab=0;
		for (int i=0;i<num.length;i++)
		{
			
			for (int j=i+1;j<num.length;j++)
			{
				if (num[i]+num[j]==target)
				{
					count++;
				}
			}
		}
		int[][]a=new int[count][2];
		
		for (int i=0;i<num.length;i++)
		{
			
			for (int j=i+1;j<num.length;j++)
			{
				if (num[i]+num[j]==target)
				{
					a[tab][0]=num[i];
					a[tab][1]=num[j];
					tab++;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(a));
	}
}
