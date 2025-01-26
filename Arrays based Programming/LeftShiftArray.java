import java.util.*;
class LeftShiftArray
{
	public static int[] leftRotate(int[]a,int n) 
	{
		for (int k=1;k<=n;k++)					// output
		{
			int first=a[0];						//n=1:int[]a={20,30,40,50,10};
			for (int i=0;i<a.length-1;i++)		//n=2:int[]a={30,40,50,10,20};
			{									//n=3:int[]a={40,50,10,20,30};
				a[i]=a[i+1];
			}
			a[a.length-1]=first;
		}
		return a;				
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={10,20,30,40,50};		
		System.out.println("\n\t"+Arrays.toString(a));
		System.out.println("\nThe length of the given array is "+a.length+"\n");
		
		System.out.print("Enter the n: \t");
		int n=sc.nextInt();
		if (n<=a.length)
		{
			int[]res=leftRotate(a,n);
			System.out.println(Arrays.toString(res));
		}
		else
		{
			System.out.print("\n\n\t\t\tEntered 'n': "+n+" is larger then size of the table is ["+a.length+"]\n");
		}
	}
}
