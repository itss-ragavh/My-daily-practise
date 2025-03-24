public class CapFirLettInSen {

    public static void main(String[] args) {
        String s="hi hello how are you harish",ans="";
        System.out.println(s);
        String[]str=s.split(" ");
        
        for (int i = 0; i < str.length; i++) {
            String cs=str[i];
            String fl=cs.charAt(0)+"";
            ans+=fl.toUpperCase()+cs.substring(1, cs.length())+" ";
        }
        System.out.println(ans);
    }
}