# NestedHasARelationshipWithArrays - Java Program

## Overview:
  This Java program demonstrates a Has-A relationship between Employee, Department, and Company classes using arrays. The program models a company structure, where:

- A Company has multiple Departments.
- A Department has multiple Employees.
- Each Employee has an ID, name, and position.

## The program defines the following relationships:
1. Employee class stores employee details.
2. Department class stores a list of employees.
3. Company class stores a list of departments.

The program initializes objects of employees, departments, and a company and displays the company structure.

## Classes:

1. Employee

- Represents an employee with attributes like ID, name, and position.
- Includes a constructor to initialize employee details.
- toString() method is overridden to provide a string representation of the employee.
  
2. Department

- Represents a department in the company.
- Stores an array of employees (with a maximum size).
- Methods include adding employees and getting employee details.
- toString() method provides a string representation of the department with employee details.

3.Company

- Represents a company with multiple departments.
- Stores an array of departments (with a maximum size).
- Methods include adding departments and getting department details.
- toString() method provides a string representation of the company with department and employee details.

### Features:
- Has-A Relationship: A Company has many Departments, and a Department has many Employees. This demonstrates the composition of objects.
- Array Usage: Uses arrays to store employees in a department and departments in a company.
- Employee, Department, Company Structure: Models a real-world business structure with employees, departments, and a company.
- Display Structure: After the setup, the program prints the company structure, including all departments and employees.


  ## Example Output:

                          Company Name: TechCorp
      Department: IT
      Employee[ID=E001, Name=Alice, Position=Developer]
      Employee[ID=E002, Name=Bob, Position=Tester]
      Department: HR
      Employee[ID=E003, Name=Charlie, Position=Manager]
      Employee[ID=E004, Name=Diana, Position=Developer]



## How to Run:

### Prerequisites:
- Java 8 or later installed on your system.
- A text editor or IDE (like IntelliJ IDEA or Eclipse) for editing and running Java code.
  
### Steps:
- Download or clone this repository to your local machine.
- Open the Java file NestedHasARelationshipWithArrays.java in your IDE or a text editor.
- Compile the Java program:
  
            javac NestedHasARelationshipWithArrays.java
- Run the program:

            java NestedHasARelationshipWithArrays
You should see the output describing the company, its departments, and the employees.

## Code Structure:
  Employee.java:
Defines an employee with ID, name, and position.

  Department.java:
Defines a department that holds employees and manages their list.

  Company.java:
Defines the company structure that holds multiple departments and prints the overall company structure.

NestedHasARelationshipWithArrays.java:
Main class that demonstrates the relationship by creating Employee, Department, and Company objects, adding data, and printing the company structure.

## Contact:
If you have any questions or suggestions, feel free to contact:

- Email: harishragavendra2305@gmail.com
- LinkedIn: www.linkedin.com/in/harishragavendra23
  
### License:
This project is open-source under the MIT License.

Let me know if you need more information or further modifications!

