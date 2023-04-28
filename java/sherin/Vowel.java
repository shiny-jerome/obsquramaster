package sherin;
import java.util.*;
public class Vowel {
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter the Character");
		Scanner letter=new Scanner(System.in);
		
 		ch=letter.nextLine().charAt(0);
		switch(ch)
		{
	
	case 'a':
		System.out.println(" a is vowel ");
		break;
	case 'A':
		System.out.println(" A is vowel ");
		break;
		
	case 'e':
		System.out.println(" e is vowel ");
		break;
	case 'E':
		System.out.println(" E is vowel ");
		break;
	case 'i':
		System.out.println(" i is vowel ");
		break;
	case 'I':
		System.out.println(" I is vowel ");
		break;
	case 'o':
		System.out.println(" o is vowel");
		break;
	case 'O':
		System.out.println(" O is vowel");
		break;
	
		
	case 'u':
		System.out.println("u is vowel ");
	case 'U':
		System.out.println("U is vowel ");
		
		break;
		default:
			System.out.println("THe entered character is Consonent");
	

}
	
	}
}
