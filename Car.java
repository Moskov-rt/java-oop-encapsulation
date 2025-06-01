package Javatasksopp;
// 6. You are designing a car rental system, and you need to create a Car class. 
// The Car class should have private instance variables for the car's make, model, and rental price per day. 
// Implement appropriate getter and setter methods for these variables, ensuring that the make and
//  model can only be set once during object creation. Additionally, include a private variable to
//  track the availability of the car (e.g., true if available for rent, false if rented), and 
//  provide public methods to rent and return the car, updating its availability status.

public class Car {
    // Private fields
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    // Constructor
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true; // available by default
    }

    // Getters (no setters for make and model)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // Getter and Setter for rental price
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay >= 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Rental price cannot be negative.");
        }
    }

    // Method to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to rent the car
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car has been rented.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    // Method to return the car
    public void returnCar() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Car has been returned.");
        } else {
            System.out.println("Car is already available.");
        }
    }

    // Display car info
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Rented"));
    }

    // Main method to test
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Yaris", 40.0);

        car.displayCarInfo();

        System.out.println("\n-- Renting the car --");
        car.rentCar();
        car.displayCarInfo();

        System.out.println("\n-- Trying to rent it again --");
        car.rentCar();

        System.out.println("\n-- Returning the car --");
        car.returnCar();
        car.displayCarInfo();
    }
}

