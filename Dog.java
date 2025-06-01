package Javatasksopp;
// 3. Write a Java program to create a class called "Dog" with a name and breed attribute. 
// Create two instances of the "Dog" class, set their attributes using the constructor and
// modify the attributes using the setter methods and print the updated values.
public class Dog {
    // Private attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create two Dog objects using constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Luna", "German Shepherd");

        // Update attributes using setters
        dog1.setName("Max");
        dog1.setBreed("Labrador");

        dog2.setName("Bella");
        dog2.setBreed("Beagle");

        // Print updated values
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}

