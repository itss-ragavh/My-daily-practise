import java.util.*;
class  Cart
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//String[]cart=new String[10];
		//System.out.println("Hello World!");
		String[]cart={"Phone","Laptop","Speaker","Bag","Bed"};
		System.out.println(Arrays.toString(cart));
		System.out.print("Enter the item you want to remove :");
		String item=sc.nextLine();
		String res=RemoveItem(item,cart);
		System.out.println(res);
		System.out.println();
		System.out.println(Arrays.toString(cart));
	}
	public  static String RemoveItem(String item,String[]cart){
		boolean found =false;
		for (int i=0;i<cart.length;i++)
		{
			if (cart[i].equals(item))
			{
				found=true;
				for (int j=i;j<cart.length-1;j++)
				{
					cart[j]=cart[j+1];
				}
				cart[cart.length - 1] = null;
				return "Item removed Successfully";
			}
		}
		if (!found)
		{
			return "Item not Found!!";
		}
		return "none!";
	}
}
