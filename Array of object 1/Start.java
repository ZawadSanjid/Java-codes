public class Start
{
	public static void main(String []args)
	{
		Array boxes[] = new Array [4];
		
		Array b1 = new Array();
		b1.setLength(1.2);
		b1.setWidth(1.3);
		b1.setHeight(1.5);
		b1.showdetails();
		boxes[0]=b1;
		System.out.println();
		
		Array b2 = new Array();
		b2.setLength(2.1);
		b2.setWidth(2.3);
		b2.setHeight(2.5);
		b2.showdetails();
		boxes[1]=b2;
		System.out.println();
		
		Array b3 = new Array();
		b3.setLength(3.1);
		b3.setWidth(3.3);
		b3.setHeight(3.5);
		b3.showdetails();
		boxes[2]=b3;}}
		