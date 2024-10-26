import java.util.Scanner;
public class ArrayInput
{
	private double length;
	private double width;
	private double height;
	
	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}

	public static void main(String []args)
	{
		
		
		ArrayInput[] boxes = new ArrayInput[4];
		Scanner scanner= new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
		ArrayInput b =new ArrayInput();
		
		System.out.println("Height");
		double s1= scanner.nextDouble();
		b.setHeight(s1);
		
		System.out.println("Width");
		double s2= scanner.nextDouble();
		b.setLength(s2);
		
		System.out.println("Length");
		double s3= scanner.nextDouble();
		b.setWidth(s3);
		
		boxes[i]=b;}

        for(ArrayInput b: boxes){
		if(b!=null){
		    System.out.println("Length: " + b.getLength());
            System.out.println("Width: " + b.getWidth());
            System.out.println("Height: " + b.getHeight());
            System.out.println();}
		  
		  else{
		  System.out.println("null");}}
}}