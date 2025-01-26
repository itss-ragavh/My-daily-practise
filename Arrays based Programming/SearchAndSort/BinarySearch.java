import java.util.*;
public class BinarySearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[]a={10,20,21,25,28,38,44,46,56,64,74};
        System.out.print("Enter the  number :");
        int key=sc.nextInt();
        Arrays.sort(a);
        String res=binarySearch(a,key);
        System.out.println(res);
        System.out.println(Arrays.toString(a));
    }
    public static String binarySearch(int[]a,int key){
        if (a.length==0) {
            return "Empty Array";
        }
        int l=0,h=a.length-1,mid=(l+h)/2;
        while (l<=h) {
            if (key==a[mid]) {
                return "\tKey "+key+" Present";
            }
            else if (key<a[mid]) {
                h=mid-1;
            }
            else if (key>a[mid]) {
                l=mid+1;
            }
            mid=(l+h)/2;
        }
        return "\tKey "+key+" Not Present";
    }

}
