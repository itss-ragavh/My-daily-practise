public class RevVowelInStr {
 public static void main(String[] args) {
    String s =new String("Athesatic")E;
    StringBuilder vow=new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char ch=s.charAt(i);
        if (ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
            vow.append(ch);
        }
    }
    StringBuilder sbvow= new StringBuilder(vow);
    String revvow= new String(sbvow.reverse());
    System.out.println(vow+"\n"+revvow);
    
    char[]chArr=s.toCharArray();
    int index=0;
   for (int i = 0; i < s.length(); i++) {
    char ch=s.charAt(i);
        if (ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
            chArr[i]=revvow.charAt(index++);
        }
   }
    
   System.out.println(s+"\n"+new String(chArr));
 }    
}
