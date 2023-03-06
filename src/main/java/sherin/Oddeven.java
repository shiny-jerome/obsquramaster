package sherin;
import java.util.*;
public class Oddeven {
public static void main (String args[])
{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the Number");
	int number= reader.nextInt();
	if(number%2==0)
	
		System.out.println("The number "+number+" is even");
		else 
			System.out.println("The number "+number+" is odd ");
	
}

}
