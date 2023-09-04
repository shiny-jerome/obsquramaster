
/* 39. Program to withdraw amount from an ATM
 Class 1- Bank
One method to set pin from „User‟ class and validate Pin in another method
[Valid pins – 1001, 1234, 1212]
Pin number should declared as private
 Class 2 – User
Get the pin from User */
package Lekshmiv;

public class ValidPinEncap
{
	
	private int pin;
	
	public void setpin(int pin)
	
	{
		
		this.pin=pin;
		
		
	}
	
public boolean validatePin(int p)
{
	if (p==1001||p==1234||p==1212)
	{
		return true;
		
		
	}
	
	else
	{
		return false;
	}
		
	
}
	

}
