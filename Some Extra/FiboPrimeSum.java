import java.util.Scanner;
class FiboPrimeSum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Start :");
		int start=sc.nextInt();
		System.out.print("Enter the End :");
		int end=sc.nextInt();
		System.out.print("Enter the Limit :");
		int limit=sc.nextInt();
		
		int sum=0;
		for(int i=start;i<=end;i++){
			if(isPrime(i)&&isFibo(i)){
				sum+=i;
			}
		}
		System.out.println(""+sum+"\n");

		String res=sum>limit? "Yes":"No";
		System.out.println(res);
	}
	public static boolean isPrime(int num){
		if(num==0||num==1){
			return false;
		}
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isFibo(int num){
		int first=0,second=1,sum=0;
		while(second<num){
			sum=first+second;
			first=second;
			second=sum;
		}
		return second==num;
	}
}
