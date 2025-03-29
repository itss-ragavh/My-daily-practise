public class AlphaCharOnlySwapString {
    public static void main(String[] args) {
        String s="hi@how#are you?";
        //output :uo@yera#woh ih?

        int i=0,j=s.length()-1;

        while (i<=j) {
            if ((s.charAt(i)<='a'&& s.charAt(i)>='z')&&(s.charAt(j)<='a'&&s.charAt(j)>='z')) {
                char ch=s.charAt(i);
                
            }
        }
    }
}
