public class product {
	private String productid;
	private String productname;
	private double price;
	private int availablequantity;
	
	product()
	{System.out.println("Default constructor");}
	
	product(String productid,String productname,double price,int availablequantity)
	
	{System.out.println("Perameter constructor");
	this.productid=productid;
	this.productname=productname;
	this.price=price;
	this.availablequantity=availablequantity;}
	
	public void setProductid(String productid)
	{this.productid=productid;}
	
	public void setProductname(String productname)
	{this.productname=productname;}
	
	public void setPrice(double price)
	{this.price=price;}
	
	public void setAvailablequantity( int availablequantity)
	{this.availablequantity=availablequantity;}
	
	public String getProductid()
	{return productid;}
	
	public String getProductname()
	{return productname;}
	
	public double getPrice()
	{return price;}
	
	public int getAvailablequantity()
	{return availablequantity;}
	
	void showdetails()
	{System.out.println("productid: " +productid);
	System.out.println("productname: " +productname);
	System.out.println("price: " +price);
	System.out.println("availablequantity: " +availablequantity);}
	
}