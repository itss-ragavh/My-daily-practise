class Employee
{
	private int eid;
	private String ename;
	private double salary;
	
	Employee(int eid,String ename,double salary){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	public int getEid(){
		return eid;
	}
	public String getEname(){
		return ename;
	}
	public double getSalary(){
		return salary;
	}
	public void setEid(int eid){
		this.eid=eid;
		System.out.println("The Employee Id updated succesfully");
	}
	public void setEname(String ename){
		this.ename=ename;
		System.out.println("The Employee Name updated succesfully");
	}
	public void setSalary(double salary){
		this.salary=salary;
		System.out.println("The Employee Salary updated succesfully");
	}
	public void detailsofEmployee(){
		System.out.println("\n\tThe Employee Id is :"+eid);
		System.out.println("\tThe Employee Name is :"+ename);
		System.out.println("\tThe Employee Salary He/She getting is :"+salary);
		System.out.println("\t============================================\n");
	}
}