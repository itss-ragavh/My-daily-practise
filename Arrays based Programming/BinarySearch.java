import java.util.*;
class  BinarySearch
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	int a[]={1,2,3,4,5,6,7,8,9,};
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the number");
		int key=sc.nextInt();
		String res=BinarySearch(a,key);
		System.out.println("The enterd number: "+key+" is "+res);
		System.out.println(Arrays.toString(a));
	}
	
	public static String BinarySearch(int[]a,int key)
	{
		int l=0,h=a.length-1,mid=(l+h)/2;
		while (l<=h)
		{
			if (key==a[mid])
			{
				return "Present";
			}
			else if (key<a[mid])
			{
				h=mid-1;
				
			}
			else if (key>a[mid])
			{
				l=mid+1;
			}
			mid=(l+h)/2;
		}
		return "Not Present";
	}
}

