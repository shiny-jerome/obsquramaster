

package Lekshmiv;
import java.util.Scanner;
public class PinEncap extends ValidPinEncap {
	private int pin;
	 
	public int getPin()
	{
		System.out.println("Enter the pin");
		Scanner reader=new Scanner(System.in);
		pin=reader.nextInt();
		return this.pin;
		
	}
	
public static void main(String args[])
{
	PinEncap e=new PinEncap();
	int s=e.getPin();
	
	
	if(e.validatePin(s)==true)
	{
		e.setpin(s);
		
		System.out.println("valid pin");
	}
	else
	{
		System.out.println("Invalid pin");
	}
}

}
