package Gopikrishnan;
import java.util.Scanner;
public class Switchvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char letter=sc.next().charAt(0);
		switch (letter) {
		case 'a':
			System.out.println("a is vowel");
			
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;

		default:
			System.out.println("entered character is not vowel");
			break;
		}
		

	}

}
