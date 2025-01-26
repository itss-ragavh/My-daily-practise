import java.util.Scanner;
class SwapNumWithoutThirdContainer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1 :");
		int a=sc.nextInt();
		System.out.print("Enter number 2 :");
		int b=sc.nextInt();
		System.out.println("\n\tBefore Swapping \n\t\tnum1 :"+a+" \n\t\tnum2 :"+b+"\n\n");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\tAfter Swapping \n\t\tnum1 :"+a+" \n\t\tnum2 :"+b);
}
}
