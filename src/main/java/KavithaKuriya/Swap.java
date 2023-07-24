package KavithaKuriya;

import java.util.Scanner;

public class Swap {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        int a = scanner.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int b = scanner.nextInt();
	        
	        System.out.println("Before swap:");
	        System.out.println("First number: " + a);
	        System.out.println("Second number: " + b);
	        
	        // Swapping numbers using a temporary variable
	        int temp = a;
	        a = b;
	        b = temp;
	        
	        System.out.println("After swap:");
	        System.out.println("First number: " + a);
	        System.out.println("Second number: " + b);
	        
	}

}
