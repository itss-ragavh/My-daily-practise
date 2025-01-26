import java.util.Arrays;
class ArraysToString 
{
	public static void main(String[] args) 
	{
		char[]a={'h','a','r','i','s','h'};
		System.out.println(Arrays.toString(a));	
		System.out.println(a);
		/*	--------------Static Way---------
		String res="";
		for (int i=0;i<a.length;i++)
		{
			res+=a[i];
		}
		System.out.println(res); 
		
		----------------Dynamic Way-------------------*/
		String res=new String(a);
		System.out.println(res);
	}
}
