package Lekshmiv;

public class MultipleInSample implements In1,In2 {
	
	public void show()
	{
		System.out.println("Show");
		
	}
	public void display()
	{
		System.out.println("display");
		
	}
	public void print()
	{
		System.out.println("print");
		
	}
	
	
	public static void main(String[] args) {
		
		 MultipleInSample m=new MultipleInSample();
		 m.show();
		 m.display();
		 m.print();
		
	}

}
