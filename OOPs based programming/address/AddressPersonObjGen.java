class AddressPersonObjGen 
{
	public static void main(String[] args) 
	{
		Person p1= new Person("Harish",new Address("Market Street","Thirukovilur",605757));
		Person p2= new Person("Vignesh",new Address("new Street","karikal",607757));
		Person p3= new Person("Dhoni",new Address("old Street","chennai",6000001));
//		p1.personofDetails();
		Person[] person={p1,p2,p3};
		for (int i=0;i<person.length;i++)
		{
			person[i].personofDetails();
		}
	}
}
