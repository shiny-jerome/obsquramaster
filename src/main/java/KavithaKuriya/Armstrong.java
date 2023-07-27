package KavithaKuriya;
import java.util.Scanner;
public class Armstrong {
	

	    public static void main(String[] args) {

	       int originalNumber, remainder, result = 0;
	        Scanner reader=new Scanner(System.in);
	        System.out.println("Enter the number");
            int number=reader.nextInt();
	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}
	


