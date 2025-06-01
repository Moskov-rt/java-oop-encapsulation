package Javatasksopp;
// 1. Write a Java program to create a class called "Circle" with a radius attribute. 
// You can access this attribute using setter and getter method. Calculate the 
// area and circumference of the circle.
public class Circle {
    private double radius;

    public void setRadious(double radius){
        if (radius >= 0){
            this.radius = radius;
        } 
        else {
            System.out.println("Radious cannot be negative.");
        }

    }

    public double getRadius(){
        return radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(){
        return 2 * Math.PI *radius;
    }
    public static void main(String[] args){
        Circle myCircle = new Circle();
        myCircle.setRadious(5.0);

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: "+ myCircle.calculateArea());
        System.out.println("Circumference: "+ myCircle.calculateCircumference());

    }
}
