import java.util.Arrays;
class  SquareTheElementsInArray
{
	public static void main(String[] args) 
	{
		int a[]={1,-2,3,-4,5};
		System.out.print("The Array before Squaring its Elements: ");
		System.out.println(Arrays.toString(a));
		int[]res=SquareElement(a);
		System.out.print("The Array after Squaring its Elements: ");
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] SquareElement(int[]x)
	{
		int[]res=new int[x.length];
		
		for (int i=0;i<x.length;i++)
		{
			res[i]=x[i]*x[i];
		}
		return res;
	}
}
