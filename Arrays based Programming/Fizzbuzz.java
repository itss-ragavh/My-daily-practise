class Fizzbuzz 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100;i++)
		{
			if (i%3!=0 && i%5!=0)
			{
				System.out.println(i);
			}
			else if (i%3==0)
			{
				if (i%5==0)
				{
					System.out.println("FizzBuzz\t"+i);
				}
				else{
				System.out.println("Fizz");}
			}
			else if (i%5==0)
			{
				System.out.println("buzz");
			}
		}
	}
}
