class Bill 
{
	//states
	Dish[] dishes;
	/*
	In Bill dishes is null means 0 Food Order
	In Bill dishes is not Null it means Some food has been ordered
	*/
	int order_no;
	String hotel_name;
	
	Bill(){}

	Bill( int order_no,String hotel_name){
		//L.I
		this.order_no=order_no;
		this.hotel_name=hotel_name;
	}
	
	public void addDish(Dish[]d ){
		if(dishes==null){
			dishes=d;
			System.out.println("Dishes Added to Bill");
		}else{
			System.out.println("Already Bill is Having Dishes");
		}
	}

	public void removeDish(){
		if(dishes!=null){
			dishes=null;
			System.out.println("All the Dishes Removed");
		}else{
			System.out.println("Already Bill is Having No Dishes");
		}
	}

	public boolean search(String food){
		if(dishes!=null){
			//Eligible for Search
			for (int i=0;i<dishes.length ;i++ )
			{
				if(dishes[i].name.equals(food))
					return true;
			}
		}else{
			System.out.println("No Dishes Present Can't Search");
		}

		return false;
	}

	public void sortByPrice(){
		if(dishes!=null){
			//Eleigible for Sorting
			for (int i=0;i<dishes.length-1 ; i++)
			{
				for (int j=0;j<dishes.length-1 ;j++ )
				{
					if(dishes[j].price>dishes[j+1].price){
						Dish temp=dishes[j];
						dishes[j]=dishes[j+1];
						dishes[j+1]=temp;
					}
				}
			}

			for(int i=0;i<dishes.length;i++){
				System.out.println(dishes[i].name);
			}
		}else{
			System.out.println("No Dishes Present to sort");
		}
	}
	

	public void calculateTotal(){
		if(dishes!=null){
			//We can calculates
			double sum=0;
			for (int i=0;i<dishes.length ;i++ )
			{
				sum+=dishes[i].price;
			}
			System.out.println("Total Bill:"+sum);
		}else{
			System.out.println("No Dishes Present to Calculate");
		}

	}
}
