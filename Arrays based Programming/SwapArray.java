import java.util.*;
public class SwapArray {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[]a={10,20,30,40,50};
        System.out.println("The given Array before Swapping numbers");
        System.out.println(Arrays.toString(a));
        System.out.println("Enter number to swap");
        int n=sc.nextInt();
        for (int k= 1; k <=n; k++) {
            int first=a[0];
            for (int i = 0; i < a.length-1; i++) {
               a[i]=a[i+1];
               
                }
                a[a.length-1]=first;
        }
       
            
        
    
        System.out.println(Arrays.toString(a));
    }
   
}
