public class Start{
public static void main(String[] args){
	
	Circle c1 = new Circle();
	
	c1.setX(2);
	System.out.println("C1 R:"+ c1.getX());
	System.out.println("C1 A:"+ c1.getArea());
	
	Circle c2 = new Circle(5);
	
	System.out.println("C2 R:"+ c2.getX());
	System.out.println("C2 A:"+ c2.getArea());
	
	Triangle t1 = new Triangle();
	
	t1.setX(2);
	t1.setY(3);
	System.out.println("T1 B:"+ t1.getX());
	System.out.println("T1 H:"+ t1.getY());
	System.out.println("T1 A:"+ t1.getArea());
	
	Triangle t2 = new Triangle(5,6);
	
	System.out.println("T2 B:"+ t2.getX());
	System.out.println("T2 H:"+ t2.getY());
	System.out.println("T2 A:"+ t2.getArea());
	
	Rectangle r1 = new Rectangle();
	
	r1.setX(2);
	r1.setY(3);
	System.out.println("R1 L:"+ r1.getX());
	System.out.println("R1 W:"+ r1.getY());
	System.out.println("R1 A:"+ r1.getArea());
	
	Rectangle r2 = new Rectangle(5,6);
	
	System.out.println("R1 L:"+ r1.getX());
	System.out.println("R1 W:"+ r1.getY());
	System.out.println("R1 A:"+ r1.getArea());
}}