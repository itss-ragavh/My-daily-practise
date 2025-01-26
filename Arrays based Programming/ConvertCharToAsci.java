import java.util.Arrays;
class ConvertCharToAsci
{
	public static void main(String[]args) 
	{
		char[]a={'A','E','I','O','U'};
		int[] res=Solve(a);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] Solve(char[]x)
	{
		int[] b=new int[x.length];
		for (int i=0;i<x.length;i++ )
		{
			b[i]=x[i];
		}
		return b;
	}
}
