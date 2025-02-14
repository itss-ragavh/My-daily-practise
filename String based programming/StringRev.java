import java.util.*;
class  StringRev
{
	public static void main(String[] args) 
	{
		String a="Harish";
		String ans="";
		System.out.println(a);
		
		for (int i=0;i<a.length();i++ )
		{
			char ch=a.charAt(i);
			if(!ans.equalsIgnoreCase(a)){
				ans+=ch+"";
			}
		}
		System.out.println(ans);//Haris
	}
}
