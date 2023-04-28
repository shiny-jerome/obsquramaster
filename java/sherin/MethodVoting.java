package sherin;
import java.util.*;
public class MethodVoting {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		
		
		System.out.println("Enter the age of candidate");
		 int age =reader.nextInt();
	
		if(candidate(age)==true)
		{System.out.println("The candidate is eligible for voting ");
		}
		else
		{
			System.out.println("te candate is not eligible for voting ");
		}
		
	}
	public static boolean candidate( int age)
	{
		
		if(age>=18)
		{
			
			return true;
		}
			else
			{
	return false;
}
}
}