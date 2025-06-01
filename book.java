package Javatasksopp;
// 3. You are developing a library management system and need to implement a Book class. 
// The Book class should have private instance variables for the book title, author name, 
// and publication year. Implement appropriate getter and setter methods to ensure encapsulation. 
// Additionally, include a private variable to track the availability of the book 
// (e.g., true if available, false if borrowed), and provide a public method to 
// borrow the book, updating its availability status.
public class Book {
    // Private attributes
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // book is available by default
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Public method to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book has been borrowed.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book has been returned.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    // Display method
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Main method to test
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", 1988);

        book.displayBookInfo();
        System.out.println("\n-- Trying to borrow the book --");
        book.borrowBook();

        book.displayBookInfo();
        System.out.println("\n-- Trying to return the book --");
        book.returnBook();

        book.displayBookInfo();
    }
}
