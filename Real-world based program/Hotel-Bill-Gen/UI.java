import java.util.*;
class UI 
{
	static Scanner sc=new Scanner(System.in);

	static Bill bill=new Bill(1,"A2B");
	static Bill bill1=new Bill(2,"Buhari");
	public static void main(String[] args) 
	{
		Dish food1=new Dish(1,40,"Idli");
		Dish food2=new Dish(2,140,"Dosa");
		Dish food3=new Dish(3,100,"Upma");
		Dish food4=new Dish(4,80,"Curd Rice");
		Dish food5=new Dish(5,20,"Pongal");
	
		Dish []dishes={food1,food2,food3,food4,food5};

		boolean flag=true;
		do
		{
			System.out.println("\t\t\tSelect the Input");
			System.out.println("1.Add Dishes\n2.Remove Dishes\n3.Search\n4.Sort\n5.Total\n6.Exit");
			int user=sc.nextInt();
			switch (user)
			{
			case 1:{
				bill.addDish(dishes);
				break;}//Add Dishes

			case 2:{
				bill.removeDish();
				break;}//Remove Dishes
			
			case 3:{
				System.out.println("\t\t\tEnter the Food to Search:");
				String food=sc.next();//Pongal
				if(bill.search(food))
					System.out.println("Present");
				else 
					System.out.println("Not Present");
				break;}//Search

			case 4:{
				bill.sortByPrice();
				break;}//Sort

			case 5:{
				bill.calculateTotal();
				break;}//Total

			case 6:{
				flag=false;
				break;}//Exit
			
			}
		}
		while (flag);
		System.out.println("\t\t\tThank You");
	}
}
