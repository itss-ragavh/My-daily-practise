import java.util.*;
public class VowNumCount {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String  :");
        String s=sc.nextLine();
        s=s.toLowerCase();
        char[]ch=s.toCharArray();
        vowNumCount(ch);
        
        // System.out.println(res);
    }
    public static void vowNumCount(char[]ch){
        int vowelCount=0,consCount=0,numCount=0;
        if (ch.length==0) {
            System.out.println("The size of the String is -'Zero'");
            return;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
                vowelCount++;
            }
            else if (ch[i]!='a'&&ch[i]!='e'&& ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u') {
                consCount++;   
            }
           
            else if (ch[i] >= '0' && ch[i] <= '9') {
                numCount++;
            }
            
        }
        System.out.println("Total vowel :"+vowelCount);
        System.out.println("Total Consonent :"+consCount);
        System.out.println("Total Number :"+numCount);
       
    }

}
