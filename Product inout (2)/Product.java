public class Product {
    private int serial;
    private String productName;
    private double cost;
    private int available_quantity;

    public Product(int serial, String productName, double cost, int available_quantity) {
        this.serial = serial;
        this.productName = productName;
        this.cost = cost;
        this.available_quantity = available_quantity;
    }

    public Product() {
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAvailableQuantity() {
        return available_quantity;
    }

    public void setAvailableQuantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }

    public void addQuantity(int amount) {
        available_quantity += amount;
        System.out.println("Added " + amount + " to available quantity.");
        System.out.println("New Available Quantity: " + available_quantity);
    }

    public void showDetails() 
	{
        System.out.println("Serial: " + serial);
        System.out.println("Product Name: " + productName);
        System.out.println("Cost: " + cost);
        System.out.println("Available Quantity: " + available_quantity);
		System.out.println();
	}
}