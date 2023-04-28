package vishnu;

public class Bank {
	
	private int pin;

	public void setPin(int pin)
	{
		if (pin==1001 || pin==1234 || pin==1212)
		{
			this.pin=pin;
			System.out.println("Pin is valid");
		}
		else
		{
			System.out.println("Pin is invalid");
		}
		
	}

}
