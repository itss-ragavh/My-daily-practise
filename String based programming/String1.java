class  String1
{
	public static void main(String a[]) 
	{
		String s=new String("harish");
		System.out.println(s);
		String res=reverseStr(s,2);
		System.out.println(res);
		// StringBuffer s1=new StringBuffer("Navin");
		// System.out.println(s1.capacity());
		// System.out.println(s.length());
		// System.out.println(s1.length());
		// System.out.println(s1.append(" Reddy"));
		// System.out.println(s1.insert(6,"Java "));
	}
	public static String reverseStr(String s, int k) {
        if(s.length()>=1 && s.length()<=10000){
           if(!(k<=s.length())){
			return "K- value larger than the string value!!";
		   }
		   String res="";
		   for (int i = k-1; i>=0; i--) {
			 res+=s.charAt(i)+"";
		   }
		   res=res.concat(s.substring(k, s.length()));

		   return res;
        }
		return "Enter the crt value-!!";
	}
}
