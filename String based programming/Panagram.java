import java.util.Arrays;
class Panagram 
{
	public static void main(String[] args) 
	{
		String s="The Quick Brown fox jumps over the lazy dog";
		System.out.println(s);
		String res= Panagram(s);
		System.out.println(res);
	}
	public static String Panagram(String s)
	{
		s=s.toUpperCase();
		System.out.println(s);
		boolean [] a=new boolean[26];
		System.out.println(Arrays.toString(a));
		char[]b=s.toCharArray();
		System.out.println(Arrays.toString(b));
		for (int i=0;i<b.length;i++ )
		{
			if (b[i]!=' ')
			{
				int index=b[i]-65;
				a[index]=true;
			}
		}
		for (int i=0;i<a.length;i++ )
		{
			if (!a[i])
			{
				return "not a panagram";
			}
		}
		System.out.println("=========================================================");
		return "panagram";
	}
}
