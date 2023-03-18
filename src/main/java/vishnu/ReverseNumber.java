package vishnu;

public class ReverseNumber {
	
	int reverse=0;
	int a;
	public ReverseNumber(int a)
	{
		this();
		this.a=a;
		while(this.a!=0) 
		{
			int remainder =this.a%10;
			reverse=reverse*10+remainder;
			this.a=this.a/10;	
		}
		
		System.out.println("Reversed number: "+reverse);
	
	}
	
	public ReverseNumber()
	{
		System.out.println("Finding reverse");
	}

}
