package Gopika;

import java.util.Scanner;

public class Vowel {
	
		public static void main(String args[])
		{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a Character");
		char a = reader.nextLine().charAt(0);
		switch(a)
		{
		case 'a':
		case 'A':
		System.out.println("Vowel");
		break;
		case 'e':
		case 'E':
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
		System.out.println("Not a Vowel");
		}
		}
		}

