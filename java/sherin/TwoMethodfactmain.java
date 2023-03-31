package sherin;
import java.util.*;
public class TwoMethodfactmain {
	public static void main(String args[])

{
		int fact=1;
		System.out.println("Enter the number to be find the factorial ");
		Scanner reader=new Scanner(System.in);
		int number=reader.nextInt();
		TwoMethodFactorial f=new TwoMethodFactorial();
		f.factorial(number);
		f.display();
		
}
}
