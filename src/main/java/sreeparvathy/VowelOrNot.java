package sreeparvathy;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the character");
		char a=reader.nextLine().charAt(0);
		switch(a)
			{
				case 'a':
				case 'A':
				
					System.out.println("Vowel");
					break;
			
				case 'i':
				case 'I':
					System.out.println("Vowel");
					break;
				
				case 'o':
				case 'O':
					System.out.println("Vowel");
					break;
				case 'u':
				case 'U':
					System.out.println("Vowel");
					break;
				default:
					System.out.println("Not a vowel");
			}
	}

}
