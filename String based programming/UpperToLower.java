package string;

public class UpperToLower {
	public static void main(String[] args) {
		String a="hElloWoRLd";
		char[]ch=a.toCharArray();
		String ans="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ans=""+ch[i].toupperCase()
			}
		}
		
	}

}
