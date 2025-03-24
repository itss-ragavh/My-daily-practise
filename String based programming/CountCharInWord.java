public class CountCharInWord {
public static void main(String[] args) {
    String s= "toyoto",ans="";
    for (int i = 0; i < s.length(); i++) {
        char ch=s.charAt(i);
        int count=0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j)==ch) {
                count++;
            }
        }
        if (!ans.contains(ch+"")) {
            System.out.println(ch+" - "+count);
            ans+=ch;
        }
   }
}    
}
