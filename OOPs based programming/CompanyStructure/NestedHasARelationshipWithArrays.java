// Main class
public class NestedHasARelationshipWithArrays {
    public static void main(String[] args) {
        // Create Employees
        Employee emp1 = new Employee("E001", "Alice", "Developer");
        Employee emp2 = new Employee("E002", "Bob", "Tester");
        Employee emp3 = new Employee("E003", "Charlie", "Manager");
        Employee emp4 = new Employee("E004", "Diana", "Developer");

        // Create Departments
        Department dept1 = new Department("IT", 5); // Maximum of 5 employees
        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);

        Department dept2 = new Department("HR", 5); // Maximum of 5 employees
        dept2.addEmployee(emp3);
        dept2.addEmployee(emp4);

        // Create Company
        Company company = new Company("TechCorp", 3); // Maximum of 3 departments
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Print company structure
        System.out.println("Company Name: " + company.getName());
        for (int i = 0; i < company.getDepartmentCount(); i++) {
            Department dept = company.getDepartments()[i];
            System.out.println("  Department: " + dept.getName());
            for (int j = 0; j < dept.getEmployeeCount(); j++) {
                Employee emp = dept.getEmployees()[j];
                System.out.println("    " + emp);
            }
        }
    }
}