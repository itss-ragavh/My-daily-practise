import java.util.*;
class ToFindPrime  
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("To Find Given number is Prime or Not");
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean flag=true;
		for (int i=2;i<n;i++)
		{
			if (n%i==0){
				flag=false;
				break;
			}
			
		}
		if (n==0||n==1){
			System.out.println("The given number "+n+" is not primary number");
		}
		else if (flag){
			System.out.println("The given number "+n+" is  primary number");
		}
		else{
			System.out.println("The given number "+n+" is not primary number");
		}
	}
}
