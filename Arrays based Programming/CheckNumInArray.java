import java.util.*;
class CheckNumInArray							//check the given number present in the array 
{
	public static boolean CheckNum(int[]a,int num)
	{
		boolean flag=false;
		if (a.length==0)
		{
			return flag;
		}
		for (int s:a )
		{
			if (num==s)
			{
				flag= true;
			}
		}
		return flag;
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("The given Array is: ");
		int[]a={1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(a));
		System.out.print("Enter the number: ");
		int num= sc.nextInt();
		boolean res = CheckNum(a,num);
		if (res)
		{
			System.out.println("The Entered number "+num+" is present in the given Array");
		}
		else{
			System.out.println("The Entered number "+num+" is not present in the given Array");
		}
		int[]b={};
		System.out.println(Arrays.toString(b));
		System.out.print("Enter the number: ");
		int n= sc.nextInt();
		boolean res1 = CheckNum(b,n);
		if (res1)
		{
			System.out.println("The Entered number "+num+" is present in the given Array");
		}
		else
			System.out.println("The Entered number "+num+" is not present in the given Array");
	}
}
