package Javatasksopp;
// 5. You are building an employee management system and need to create an Employee  class. 
// The Employee class should have private instance variables for the employee name, employee ID, 
// and salary. Implement getter and setter methods for the name and ID, but ensure that the salary 
// can only be updated through a specific method that increases or decreases the amount while preventing negative values.
public class Employee2 {
    // Private fields
    private String employeeName;
    private String employeeID;
    private double salary;

    // Constructor
    public Employee2(String employeeName, String employeeID, double salary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Initial salary cannot be negative. Setting to 0.");
            this.salary = 0;
        }
    }

    // Getters and setters for name and ID
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    // Getter for salary (no setter)
    public double getSalary() {
        return salary;
    }

    // Method to update salary
    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
            System.out.println("Salary updated by " + amount + ". New salary: $" + salary);
        } else {
            System.out.println("Salary update failed. Salary cannot be negative.");
        }
    }

    // Display method
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Current Salary: $" + salary);
    }

    // Main method to test
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Anil Gurung", "EMP102", 30000);

        emp.displayEmployeeInfo();

        System.out.println("\n-- Increasing salary by 5000 --");
        emp.updateSalary(5000);

        System.out.println("\n-- Attempting to decrease salary by 40000 (should fail) --");
        emp.updateSalary(-40000);

        System.out.println("\n-- Final Employee Info --");
        emp.displayEmployeeInfo();
    }
}
