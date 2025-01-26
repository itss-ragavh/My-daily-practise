import java.util.Scanner;
class Factorial 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number :");
		int num=sc.nextInt();

		int fact=Facto(num);
		System.out.println("The enterd number was "+num+" and the factorial of the number is :"+fact);
		System.out.println();
	}
	public static int Facto(int num)
	{
		int fact=1;
		for (int i=num;i>=1;i--)
		{
			fact*=i;
		}
		return fact; 
	}
}
class CountDigit
{
	static Scanner sz=new Scanner (System.in);
	public static void main(String[]args)
	{
		System.out.print("Enter the number :");
		int num=sz.nextInt();
		int temp=num,count=0;
		while (num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("\n\tThe digit of number contains is:"+count);
	}
}
class SumNo
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for (int i=0;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("\t\t"+sum);
	}

}
class Pyramid
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter the Number of rows");
		int n=sc.nextInt();
		for (int i=0;i<=n;i++ )
		{
			for (int j=0;j<=n;j++)
			{
				if (i>j)
				{
					System.out.print(i+ " ");
				}
			}
			System.out.println();
		}
	}
}
class PrimeRange
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter the First Number ");
		int s=sc.nextInt();	
		System.out.println("Enter the Second Number ");
		int l=sc.nextInt();	
		
		for (int i=s;i<=l;i++)
		{
			boolean flag=true;
			if (i<=1)
			{
				flag= false;
				continue;
			}
			
			
			for (int j=2;j<i;j++)
			{
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				System.out.print(i+" ");
			}
		}
	}
}



