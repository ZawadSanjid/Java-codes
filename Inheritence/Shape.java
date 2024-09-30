public class Shape {

double x;

public Shape()
{
	System.out.println("Empty constructor");
}

public Shape(double x)
{ 
    System.out.println("Para constructor");
	this.x=x;
}

public void setX(double x)
{
	this.x=x;
}

public double getX()
{
	return x;
}

public double getArea()
{
	return -1;
}
}