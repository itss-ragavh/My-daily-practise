public class RevWordInSen {
 public static void main(String[] args) {
    String s="Hi hello how are you buddy";
    System.out.println(s);
    String[]str=s.split(" ");
    String ans="";
    for (int i = 0; i < str.length; i++) {
        String cs=str[i];
        String os="";
        for (int j = cs.length()-1; j >=0; j--) {
            char ch=cs.charAt(j);
            os+=ch;
        }
        ans+=os+" ";
    }
    System.out.println(ans);
 }    
}
