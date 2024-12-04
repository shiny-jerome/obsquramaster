package KavithaKuriya;

import java.util.Scanner;

public class primeOrnot {

	public static void main(String[] args) {
		
		      Scanner reader=new Scanner(System.in); 
		      System.out.println("enter the number you want to check");
		      int number = reader.nextInt();
		        boolean isPrime = true;

		        if (number <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i * i <= number; i++) {
		                if (number % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }
		        if (isPrime) {
		            System.out.println(number +"is a prime number");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		    }
	}


