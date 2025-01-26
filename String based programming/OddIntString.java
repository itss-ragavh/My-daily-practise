class OddIntString 
{
	public static void main(String[] args) 
	{
		String s="S2y34e3d";
		System.out.println(s);
		char[]a=s.toCharArray();
		System.out.println(a);
		int sum=0;
		String r="";
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>='0'&&a[i]<='9')
			{
				sum+=a[i]-48;
				r+=a[i]+"+";
			}
		}
		System.out.print(r+"0= ");
		System.out.print(sum);
	}
}
