
public class UpperToLower {
	public static void main(String[] args) {
		String a="hElloWoRLd";
		char[]ch=a.toCharArray();
		String ans="";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='a'&&ch[i]<='z') {
				String c=ch[i]+"";
				ans+=c.toUpperCase();
			}
			else if (ch[i]>='A'&&ch[i]<='Z') {
				String c=ch[i]+"";
				ans+=c.toLowerCase();
			}
		}
		System.out.println(a);
		System.out.println(ans);
	}

}
