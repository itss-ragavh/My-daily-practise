import java.util.Scanner;
class EmployeeObjGen 
{
	static Scanner sc=new Scanner(System.in);
	static Employee e1=new Employee(1001,"Harish",25000.80);
	static Employee e2=new Employee(1002,"Ragav",30000.80);
	static Employee e3=new Employee(1003,"Rakesh",40000.80);
	static Employee[]employee={e1,e2,e3};
	public static void main(String[] args) 
	{
		boolean flag=true;
		do
		{
			System.out.println("\nList Of Options\n\t1.Employee details\n\t2.Edit Employee Name\n\t3.Exit");
			System.out.print("\nEnter the Option :");
			int option=sc.nextInt();
			switch (option)
			{
			case 1:
				{
					int count =employee.length;
					System.out.println("There are totally "+count+" number of Employee are there.\n");
					for (int i=0;i<employee.length;i++)
					{
						employee[i].detailsofEmployee();
					}	
					//employee[1].detailsofEmployee(); for selecting single value from array;
					break;
				}//view details
			case 2: {
                    // Edit Employee Name
                    System.out.print("Enter the Employee ID: ");
                    int Eid = sc.nextInt();
                    boolean employeeFound = false;

                    // Search for employee with matching ID
                    for (Employee emp : employee) {
                        if (emp.getEid() == Eid) {
                            System.out.print("Enter the new name for Employee ID " + Eid + ": ");
                            String newName = sc.next();
                            emp.setEname(newName);
                            System.out.println("Employee name updated successfully.");
                            employeeFound = true;
                            break; // Exit loop once found
                        }
                    }

                    if (!employeeFound) {
                        System.out.println("Employee with ID " + Eid + " not found.");
                    }
                    break;
                }//edit details
			case 3:
				{
					System.out.println("__--__Thanyou __--__");
					flag=false;
					break;
				}//exit
			default:
				{
					System.out.println("Enter the Valid Option");
					break;
				}
			}
		}
		while (flag);
		System.out.println("--------------------------");
	}
}
