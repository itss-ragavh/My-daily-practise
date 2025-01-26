import java.util.Arrays;
class ReverseZigZagArrays
{
	public static void main(String[] args) 
	{
		System.out.println("The Program for zig zag[Arrays]");
		int[]a={1,2,3,4,5};
		int[]b={6,7,8,9,10};
		System.out.println("Before ZigZag the two arrays");
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int res[]=solve(a,b);
		System.out.println("After ZigZag the two arrays");
		System.out.println(Arrays.toString(res));
	}
	public static int[] solve(int[]a,int[]b)
	{
		int[]res=new int[a.length+b.length];
		for (int i = 0; i < res.length; i++)
		{
            if (i % 2 == 0) 
			{
                res[i] = a[i / 2]; 
            }
			else 
			{
                res[i] = b[b.length - 1 - (i / 2)]; 
        	}
        }
		return res;
	}
}
