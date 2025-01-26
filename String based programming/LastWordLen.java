import java.util.Scanner;

public class LastWordLen {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the para :");
        String str=sc.nextLine();
        int len=lengthOfLastWord(str);
        System.out.println("The length of the last Word of the given para is :"+len);
    }
    
        public static int lengthOfLastWord(String s) {
            String[]str=s.split(" ");
            String res=str[str.length-1];
            return res.length();
        }
    
}
