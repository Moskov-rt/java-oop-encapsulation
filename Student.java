package Javatasksopp;
// 4. You are working on a student information system and need to create a Student class. 
// The student class should have private instance variables for the student's name, ID number, 
// and grade point average (GPA). Implement getter and setter methods for the name and ID number, 
// ensuring that they can be accessed and modified only through these methods. However, the GPA 
// should be read-only and can only be set within the class constructor.

public class Student {
    // Private fields
    private String name;
    private String idNumber;
    private final double gpa;  // read-only, set via constructor

    // Constructor
    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for ID number
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // Read-only GPA getter
    public double getGpa() {
        return gpa;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("GPA: " + gpa);
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student = new Student("Sita Sharma", "ST2025", 3.85);

        student.displayInfo();

        System.out.println("\n-- Updating name and ID --");
        student.setName("Sita Devi");
        student.setIdNumber("ST2025-NEPAL");

        student.displayInfo();

        System.out.println("\n-- GPA remains unchanged (read-only) --");
        System.out.println("GPA: " + student.getGpa());
    }
}
