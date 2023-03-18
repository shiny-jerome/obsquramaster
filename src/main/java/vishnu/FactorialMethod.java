package vishnu;

public class FactorialMethod {
	int factorial=1;
	
	public void calculation(int a)
	{
		for( int i=1;i<=a;i++)
		{
			factorial*=i;
		}
	}
	
	public void print()
	{
		System.out.println("Factorial="+factorial);
	}

}
