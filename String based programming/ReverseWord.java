import java.util.Scanner;

public class ReverseWord {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the paragraph :");
        String str=sc.nextLine();
        String res=reverseWords(str);
        System.out.println(res);
    }
        public static String reverseWords(String s) {
          String res="";
          String[]r=s.trim().split("\\s+");
          for(int i=r.length-1;i>=0;i--){
            res+=r[i];
            if(i>0){
                res+=" ";
            }
          }
          return res;
        }
    
}
