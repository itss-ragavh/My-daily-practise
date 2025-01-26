import java.util.Arrays;
class FIndNumGreaterGivenNum
{
	public static void main(String[] args) 
	{
		int[]a={1, 5, 3, 8, 2};
		int Threshold=4;
		System.out.println(Arrays.toString(a));
		System.out.println("Threshold num is: "+Threshold);
		int[] res=GreatnumOrEmpty(a,Threshold);
		System.out.print("The numbers greater than Threshold("+Threshold+") is: ");
		System.out.println(Arrays.toString(res));
	}
	public static int[] GreatnumOrEmpty(int[]x,int num)
	{
		int count=0;
		for (int i=0;i<x.length;i++)
		{
			if (x[i]>num)
			{
				count++;
			}
		}
		
		int []c=new int[count];
		int index=0;
		for (int j:x)
		{
			if (j>num)
			{
				c[index]=j;
				index++;
			}
		}
		return c;
	}
}
