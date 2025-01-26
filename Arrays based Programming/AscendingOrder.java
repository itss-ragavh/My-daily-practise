import java.util.Arrays;
class  AscendingOrder
{
	public static int[] solve(int[]a) 
	{
		Arrays.sort(a);
		return a;	
	}
	public static void main(String[] args) 
	{
		int[]a={10,2,3,4,5};
		
		System.out.println("Before Ascending the arrays");
		System.out.println(Arrays.toString(a));
		int res[]=solve(a);
		System.out.println("After Ascending the arrays");
		System.out.println(Arrays.toString(res));
	}
}
