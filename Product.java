package Javatasksopp;
// 1. You are developing an e-commerce application and need to implement a Product class. 
// The Product class should have private instance variables for the product name, product ID, 
// and price. Implement getter and setter methods for these variables, ensuring that the price 
// cannot be negative. Additionally, include a private variable to track the stock quantity and 
// provide public methods to update the stock when a product is purchased or restocked.
public class Product {
    // Private fields
    private String productName;
    private String productID;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String productName, String productID, double price, int stockQuantity) {
        this.productName = productName;
        this.productID = productID;
        setPrice(price);
        this.stockQuantity = stockQuantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Method to purchase product
    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
            System.out.println("Purchased " + quantity + " item(s).");
        } else {
            System.out.println("Invalid quantity or not enough stock.");
        }
    }

    // Method to restock product
    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println("Restocked " + quantity + " item(s).");
        } else {
            System.out.println("Invalid restock quantity.");
        }
    }

    // Display method
    public void displayProductInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Stock Available: " + stockQuantity);
    }

    // Main method to test
    public static void main(String[] args) {
        Product p = new Product("Wireless Mouse", "P001", 29.99, 100);

        p.displayProductInfo();
        System.out.println("\n-- Purchasing 5 items --");
        p.purchase(5);

        System.out.println("\n-- Restocking 10 items --");
        p.restock(10);

        System.out.println("\n-- Updated Product Info --");
        p.displayProductInfo();
    }
}

