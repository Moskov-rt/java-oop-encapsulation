package Javatasksopp;
// 2. Write a Java program to create a class called “Simple Interest” 
// with a data fields principle, time and rate, using setter getter method and print the values.
public class SimpleInterest {
    // Private attributes
    private double principal;
    private double rate;
    private double time;

    // Setter methods
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(double time) {
        this.time = time;
    }

    // Getter methods
    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public double getTime() {
        return time;
    }

    // Method to calculate simple interest
    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    // Main method to test the class
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();

        si.setPrincipal(10000);
        si.setRate(5);     
        si.setTime(2);      

        System.out.println("Principal: " + si.getPrincipal());
        System.out.println("Rate: " + si.getRate() + "%");
        System.out.println("Time: " + si.getTime() + " years");

        double interest = si.calculateInterest();
        System.out.println("Simple Interest: " + interest);
    }
}
