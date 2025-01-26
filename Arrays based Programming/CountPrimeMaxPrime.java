import java.util.*;
class  CountPrimeMaxPrime
{
	public static boolean IsPrime(int number) 
	{
		if (number==0||number==1)
		return false;
		for (int i=2;i<number;i++)
		{
			if (number%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static String getNumber(int number)
	{
		int count=0,max=number;
		for (int i=1;i<=number;i++)
		{
			if (IsPrime(i))
			{
				count++;
				max=i;
			}
		}
		return count+":"+max;
	}
		
	public static void main(String[] args) 
	{
		int[]a={10,16,6,8,3};
		String[]ans=new String[a.length];
		for (int i=0;i<a.length;i++)
		{
			ans[i]=getNumber(a[i]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(ans));
	}
}
