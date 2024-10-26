import java.util.Scanner;
public class Start {

    public static void main(String[] args) 
	{
        
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine(); 
		Product p1[]=new Product[numberOfProducts];

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Serial: ");
            int serial = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Cost: ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Available Quantity: ");
            int availableQuantity = scanner.nextInt();
            scanner.nextLine(); 
			Product p1[i] = new Product(serial, productName, cost, availableQuantity);
			 
            System.out.println(); 
        }
		
		for (Product product : p1 )
		{
			System.out.println("Product Details: ");
			product.showDetails();
			
		}

       
	}
}