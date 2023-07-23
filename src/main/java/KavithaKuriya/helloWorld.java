package KavithaKuriya;

import java.util.Scanner;

public class helloWorld {
 static String text;
	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		System.out.println("Enter the sttring");
		text=reader.next();
		System.out.println("The string is:"+text);
	}
}
