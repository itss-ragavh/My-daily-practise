
package com;
import java.util.Scanner;

class StringJava {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String :");
        String ss=sc.nextLine();
        String s=ss.toLowerCase();//used to convert the upper to lowercase.
        char[]ch=s.toCharArray();
        String s1="";
        for (int i = 0; i < ch.length; i++) {
            int count=1;
            char c=ch[i];
            
            if(s1.contains(c+"")||c==' '|| c>=33&&c<=47 ||c>=58&&c<=64||c>=91&&c<=96||c>=123&&c<=126||c>='0'&&c<='9'){
                continue; //it is used to skip the char if it is reapted either does it has any special in character in it
            }
            s1+=c;
            for (int j = i+1; j < ch.length; j++) {
              
                if (c==ch[j]) {
                count++;
                }
            }
            System.out.println(c+"-"+count);
        }

    }
}