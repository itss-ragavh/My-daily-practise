import java.util.*;
class  RigthsiftArrays
{
	public static int[] rigthRotate(int[]a, int n) 
	{
		        for (int k = 0; k < n; k++) {
            int last = a[a.length - 1]; // Store the last element
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1]; // Shift elements to the right
            }
            a[0] = last; // Place the last element at the start
        }
        return a;

	}

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={10,20,30,40,50};		
		System.out.println("\n\t"+Arrays.toString(a));
		System.out.println("\nThe length of the given array is "+a.length+"\n");
		
		System.out.print("Enter the n: \t");
		int n=sc.nextInt();
		if (n<=a.length)
		{
			int[]res=rigthRotate(a,n);
			System.out.println(Arrays.toString(res));
		}
		else
		{
			System.out.print("\n\n\t\t\tEntered 'n': "+n+" is larger then size of the table is ["+a.length+"]\n");
		}
	}
}
