package Lekshmiv;
import java.util.Scanner;

public class Vowel {
	
	public static void main(String args[])

	 {

	  System.out.println("Enter a charecter");

	   Scanner reader=new Scanner(System.in);
	  
	char v=reader.nextLine().charAt(0);

	switch(v)

	{

	case 'a':
	case 'A':
	  
	   System.out.println("The entered letter is vowel");
	   break;


	case 'e':
	case 'E':
	  
	   System.out.println("The entered letter is vowel");
	   break;


	case 'i':
	case 'I':
	  
	   System.out.println("The entered letter is vowel");
	   break;

	case 'o':
	case 'O':
	  
	   System.out.println("The entered letter is vowel");
	   break;

	case 'u':
	case 'U':
	  
	   System.out.println("The entered letter is vowel");
	   break;
	default:

	System.out.println("The entered letter is not vowel");

	}
	}
	

}
