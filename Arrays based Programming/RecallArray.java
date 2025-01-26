import java.util.*;
class RecallArray 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,5,6,7,8,9};
		System.out.println("\n\tThe Given Array is \n\t"+Arrays.toString(a));
		System.out.println("\n1.Find Largest and Smallest\n2.Reverse\n3.SecondLargest\n4.SortAscending\n5.Add Element");
		System.out.print("\n\tEnter the choice :");
		int s=sc.nextInt();
		switch (s)
		{
		case 1:
			{
				findLarSmal(a);
				break;
			}
		case 2:
			{
				reverse(a);
				break;
			}
		case 3:
			{
				break;
			}
		case 4:
			{
				break;
			}	
		case 5:
			{
				AddElement(a);
				break;
			}
		default:
			{
				System.out.println("\n\n\t\tENTER A VaLID CHOICE");
				break;
			}
		}
	}
	public static void findLarSmal(int[]a)
	{
		System.out.println("\n\tThe Given Array is \n\t"+Arrays.toString(a));
		int small=a[0],large=a[0];
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>large)
			{
				large=a[i];
			}
			else if (a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("\n\tThe Largest is "+large+"\n\tSmallest is :"+small);
	}
	public static void reverse(int[]a)
	{
		System.out.println("\n\tThe Given Array is \n\t"+Arrays.toString(a)+"\n");
		System.out.println("\n\tThe Given Array in reversed Order");
		System.out.print("\n\t");
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void AddElement(int[]a)
	{
		System.out.println("\n\tThe Given Array is \n\t"+Arrays.toString(a)+"\n");
		int sum=0,evenSum=0,oddSum=0;
		for (int i=0;i<a.length;i++ )
		{
			sum+=a[i];
			if (a[i]%2==0)
			{
				evenSum+=a[i];
			}
			else
			{
				oddSum+=a[i];
			}
		}
		System.out.println("\n\n\tThe Sum Of All Element of the Array is:"+sum+"\n\tThe Even element Sum is :"+evenSum+"\n\tThe Odd element sum is :"+oddSum);
	}
}
