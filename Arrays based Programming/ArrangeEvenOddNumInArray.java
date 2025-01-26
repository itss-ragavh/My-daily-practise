import java.util.Arrays;
class  ArrangeEvenOddNumInArray
{
	public static void main(String[] args)								//Input: {3, 1, 2, 4, 5, 6}
	{																	//Output: {2, 4, 6, 3, 1, 5}
		System.out.println("Array before rearranging it");								
		int a[]={3, 1, 2, 4, 5, 6};
		System.out.println("\n\t\t"+Arrays.toString(a));
		System.out.println("Array After rearranging it");
		int[]res=Arrange(a);
		System.out.println("\n\t\t"+Arrays.toString(res));
	}																	
	
	public static int[] Arrange(int[]x)
	{
		int[]res=new int[x.length];
		int EvenIndex=0;
		int OddIndex=res.length-1;
		for (int i=0;i<x.length;i++)
		{
			if (x[i]%2==0)
			{ 				
				res[EvenIndex]=x[i];
				EvenIndex++;
			}
			else 
			{
				res[OddIndex]=x[i];
				OddIndex--;
			}
		}
		return res;
	}
}
