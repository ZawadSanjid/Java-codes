public class ObjArrayDemo
{
	public static void main(String []args)
	{
		Box boxes[] = new Box [4];
		
		Box b1 = new Box();
		b1.setLength(1.2);
		b1.setWidth(1.3);
		b1.setHeight(1.5);
		boxes[0]=b1;
		
		Box b2 = new Box();
		b2.setLength(2.1);
		b2.setWidth(2.3);
		b2.setHeight(2.5);
		boxes[1]=b2;
		
		Box b3 = new Box();
		b3.setLength(3.1);
		b3.setWidth(3.3);
		b3.setHeight(3.5);
		boxes[2]=b3;
		
		/*for(int i=0; i<boxes.length; i++)
		{
			if(boxes[i] != null)
			{
				System.out.println("boxes["+i+"] Length: "+boxes[i].getLength());
				System.out.println("boxes["+i+"] Width: "+boxes[i].getWidth());
				System.out.println("boxes["+i+"] Height: "+boxes[i].getHeight());
				System.out.println();
			}
			else
			{
				System.out.println("There is null in boxes["+i+"]");
				System.out.println();
			}
		}*/
		
		for(Box b : boxes)
		{
			if(b != null)
			{
				System.out.println("Length: "+b.getLength());
				System.out.println("Width: "+b.getWidth());
				System.out.println("Height: "+b.getHeight());
				System.out.println();
			}
			else
			{
				System.out.println("There is Null Somewhere\n");
			}
		}
		
	}
}