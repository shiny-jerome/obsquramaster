package Lekshmiv;

public class DivisybleTen extends ExampleSuper{
	public void checkdivisible()
	
	{
		
		int d=super.add(10,20);
		if(d%10==0)
			
		{
			System.out.println("The number is divisble by 10");
		}
		else
			System.out.println("The number is not divisble by 10");
	}
	
	public static void main(String args[])
	
	{ 
		DivisybleTen b=new DivisybleTen();
		b.checkdivisible();
		
	}
	
	

}
