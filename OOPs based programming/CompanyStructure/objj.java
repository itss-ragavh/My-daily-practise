// Employee class
class Employee {
    private String id;
    private String name;
    private String position;

    // Constructor
    public Employee(String id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Position=" + position + "]";
    }
}

// Department class
class Department {
    private String name;
    private Employee[] employees; // Array to store employees
    private int employeeCount; // Counter to track the number of employees

    // Constructor
    public Department(String name, int maxEmployees) {
        this.name = name;
        this.employees = new Employee[maxEmployees]; // Fixed-size array
        this.employeeCount = 0;
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = employee;
        } else {
            System.out.println("Department is full! Cannot add more employees.");
        }
    }

    // Get all employees in the department
    public Employee[] getEmployees() {
        return employees;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Department[Name=" + name + ", Employees=[");
        for (int i = 0; i < employeeCount; i++) {
            sb.append(employees[i]);
            if (i < employeeCount - 1) {
                sb.append(", ");
            }
        }
        sb.append("]]");
        return sb.toString();
    }
}

// Company class
class Company {
    private String name;
    private Department[] departments; // Array to store departments
    private int departmentCount; // Counter to track the number of departments

    // Constructor
    public Company(String name, int maxDepartments) {
        this.name = name;
        this.departments = new Department[maxDepartments]; // Fixed-size array
        this.departmentCount = 0;
    }

    // Add a department to the company
    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount++] = department;
        } else {
            System.out.println("Company is full! Cannot add more departments.");
        }
    }

    // Get all departments in the company
    public Department[] getDepartments() {
        return departments;
    }

    public int getDepartmentCount() {
        return departmentCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Company[Name=" + name + ", Departments=[");
        for (int i = 0; i < departmentCount; i++) {
            sb.append(departments[i]);
            if (i < departmentCount - 1) {
                sb.append(", ");
            }
        }
        sb.append("]]");
        return sb.toString();
    }
}


