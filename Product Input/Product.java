import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int availableQuantity;
    
    public Product() {
        System.out.println("Default constructor");
    }
    
    public Product(String productId, String productName, double price, int availableQuantity) {
        System.out.println("Parameterized constructor");
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    
    void showDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + availableQuantity);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter details for 1st product:");
        System.out.print("Product ID: ");
        String s1 = scanner.nextLine();
        System.out.print("Product Name: ");
        String s2 = scanner.nextLine();
        System.out.print("Price: ");
        double s3 = scanner.nextdouble();
        System.out.print("Available Quantity: ");
        int s4 = scanner.nextInt();
        scanner.nextLine(); 
        
        Product p1 = new Product(s1, s2, s3, s4);
        
        System.out.println();
        System.out.println("Enter details for 2nd product:");
        System.out.print("Product ID: ");
        String s5 = scanner.nextLine();
        System.out.print("Product Name: ");
        String s6 = scanner.nextLine();
        System.out.print("Price: ");
        double s7 = scanner.nextDouble();
        System.out.print("Available Quantity: ");
        int s8 = scanner.nextInt();
        scanner.nextLine(); 
        
        Product p2 = new Product(s5, s6, s7, s8);
        
        System.out.println();
        System.out.println("Details of 1st product:");
        p1.showDetails();
        
        System.out.println();
        System.out.println("Details of 2nd product:");
        p2.showDetails();
        
        
    }
}
