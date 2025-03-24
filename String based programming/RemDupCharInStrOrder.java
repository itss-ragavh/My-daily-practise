public class RemDupCharInStrOrder {
 public static void main(String[] args) {
    String s="rraaggvvhh",ans="";
    for (int i = 0; i < s.length(); i++) {
        char ch=s.charAt(i);
        if (!ans.contains(ch+"")) {
            ans+=ch;
        }
    }
    System.out.println(s+"\n"+ans);
 }    
}
