package vishnu;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter any letter");
		char letter=reader.next().charAt(0);
		
		switch (letter)
		{
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
				System.out.println("Not a vowel");
		}
	}

}
