package Lekshmiv;

public class GrandParent extends Child2
 {
	
	int g1,g2;
	public void grandDisplay()
	{
		
		System.out.println("grand parent extends child2 which extends child1");
	}
public static void main(String args[])
{
	GrandParent obj1=new GrandParent();
	 obj1.child1Display();
	 obj1.child2Display();
	 obj1.grandDisplay();
	
}

 }
