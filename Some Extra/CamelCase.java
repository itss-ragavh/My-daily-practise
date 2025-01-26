package string;

import java.awt.SystemTray;
import java.util.Arrays;

public class CamelCase {
	
	public static void main(String[] args) {
		String s="hi iam harish";
		System.out.println(s);
		String[]a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{			
			a[i]=a[i].substring(0,1).toUpperCase().concat(a[i].substring(1).toLowerCase());
			
		}
		//System.out.println(Arrays.toString(a));
		String res=String.join(" ",a);
		System.out.println(res);
	}	
	
	    
	}
		
}
