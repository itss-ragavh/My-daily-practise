import java.util.*;
class FibanociSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number :");
		int series=sc.nextInt();
		int n1=0,n2=1,n3;
		for (int i=1;i<=series ;i++ )
		{
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n3=n3;
		}
	}
}
