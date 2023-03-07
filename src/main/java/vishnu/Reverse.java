package vishnu;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any numbers");
		
		int number=reader.nextInt();
		int reverse = 0;  
		
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		
		}  
		
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}
