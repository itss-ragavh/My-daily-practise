import java.util.Arrays;

class ReturnEveOrEmptyArray 
{
    public static void main(String[] args)
	{
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original Array: " + Arrays.toString(a));
        int[] res1 = EvenOrEmpty(a);
        System.out.println("Even Numbers: " + Arrays.toString(res1));
        
        int[] b = {1, 3};
        System.out.println("Original Array: " + Arrays.toString(b));
        int[] res2 = EvenOrEmpty(b);
        System.out.println("Even Numbers: " + Arrays.toString(res2));
    }

    public static int[] EvenOrEmpty(int[] x)
		{
			int evenCount = 0;
	        for (int i=0;i<x.length;i++) 
			{
				if (x[i] % 2 == 0) {
                evenCount++;
            }
        }

        int[] c = new int[evenCount];

        int index = 0;
        for (int num : x) 
		{
            if (num % 2 == 0) 
			{
                c[index] = num;
                index++;
            }
        }

        return c; 
    }
}
