package lekshmi;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner reader =new Scanner(System.in);
 System.out.println("Enter the Character");
 char a = reader.nextLine().charAt(0);
 switch(a)
 {
 case 'a':
 case 'A':
 System.out.println("It is Vowels");
 break;
 case 'e':
 case 'E':
 System.out.println("It is Vowels");
 break;
 case 'i':
 case 'I':
 System.out.println("It is Vowels");
 break;
 case 'o':
 case 'O':
 System.out.println("It is Vowels");
 break;
 case 'u':
 case 'U':
 System.out.println("It is Vowels");
 break;
 default:
 System.out.println("It is not Vowel");
 }
 }
 }


