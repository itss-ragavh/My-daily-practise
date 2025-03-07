import java.util.*;
public class CamelCase {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s=sc.nextLine();

        
        

        camelCase(s);
        //hi hello how are you
        //Hi Hello How Are You
       
    }
   
    public static void camelCase(String s){
       
        String[] str=s.split(" ");
        StringBuilder ans=new StringBuilder("");
        for (int i = 0; i < str.length; i++) {
            String st=str[i];
            ans= ans.append(st.toUpperCase().charAt(0)).append(st.substring(1, st.length())+" ");


        }
        System.out.println(ans);
       
        }
        
    }
