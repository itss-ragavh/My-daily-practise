import java.util.Scanner;
class PowerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Number :");
		int n=sc.nextInt();
		System.out.print("Enter the Power :");
		int p=sc.nextInt();
		int ans=1;
		for (int i=1;i<=p;i++)
		{
			ans=ans*n;
		}
		System.out.println("The Number "+n+" Mulipled itself at at "+p+" is = "+ans);
	}
}
