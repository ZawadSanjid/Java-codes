public class Circle extends Shape{
	public Circle()
	{
		System.out.println("For Circle: ");
	}

	public Circle(double x)
	{
		super(x);
	}
		
	
	public double getArea()
	{
		return 3.1416*x*x;
	}
}