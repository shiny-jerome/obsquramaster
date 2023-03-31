package sherin;
import java.util.*;
public class AtmBankclass {
	private int pin;
	public void setPin(int pin)
	{
		this.pin=pin;
		if (pin==1001||pin==1234||pin==1212)
		{
			System.out.println("The pin is valid");
		}
		else
		{
			System.out.println("The pin is invalid");
		}

	}
}
	


