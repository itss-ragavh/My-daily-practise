class Address
{
	private String street;
	private String city;
	private int zipcode;
	
	public Address(String street,String city,int zipcode)
	{
		this.street=street;
		this.city=city;
		this.zipcode=zipcode;
	}
		
	public String getStreet(){
		return street;
	}
	public String getCity(){
		return city;
	}
	public int getZipcode(){
		return zipcode;
	}
	
	/*public void addressofDetails(){
		System.out.println(""+street);
		System.out.println(""+city);
		System.out.println(""+zipcode);
	}*/
}