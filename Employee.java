package Javatasksopp;
// 4. Write a Java program to create a class called "Employee" 
// with a name, job title, and salary attributes, and methods to calculate and update salary.
public class Employee {
    // Private attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12;
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Software Developer", 5000);

        System.out.println("Initial Employee Details:");
        emp.displayInfo();

        System.out.println("\nUpdating salary...");
        emp.setSalary(6000);

        System.out.println("Updated Employee Details:");
        emp.displayInfo();

        System.out.println("Yearly Salary: $" + emp.calculateYearlySalary());
    }
}

