public class Startclass{
	public static void main(String[] args){
	System.out.println("1st object");
	
	product p1=new product();
	p1.setProductid("123");
	p1.setProductname("drinks");
	p1.setPrice(550);
	p1.setAvailablequantity(100);
	p1.showdetails();
	
	System.out.println();
	System.out.println("2nd object");
	
	product p2=new product();
	p2.setProductid("456");
	p2.setProductname("food");
	p2.setPrice(9942);
	p2.setAvailablequantity(100);
	p2.showdetails();
	
	System.out.println();
	System.out.println("3rd object");
	
	product p3=new product("789","fruit",895,50);
	p3.showdetails();
	
	System.out.println();
	System.out.println("4th object");
	
	product p4=new product("101112","toys",9852,50);
	p4.showdetails();
}}