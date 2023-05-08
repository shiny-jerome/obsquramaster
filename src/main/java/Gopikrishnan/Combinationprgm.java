package Gopikrishnan;

import java.util.Scanner;

public class Combinationprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("1. Pyramid");
		System.out.println("2. Odd or Even");
		System.out.println("3. Vowel or Not");
		System.out.println("4. Palindrome");
		System.out.println("Enter your option: ");
		Scanner sc=new Scanner(System.in);
		String c="";
			
		
		int option=sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("PYRAMID");
			// TODO Auto-generated method stub
				
					System.out.println("enter number: ");
					int n=sc.nextInt();
					
					for(int i=0;i<n;i++) {
						
							for(int j=0;j<=i;j++) {
										System.out.print("* ");
							}
							System.out.println();
					}
				
			
			break;
			
			//pyramid program ends
			//odd or even starts
		case 2:
			System.out.println("ODD OR EVEN");
			System.out.println("enter number to check odd or even: ");
			int num=sc.nextInt();
			if(num%2==0) {
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
			break;
			//odd or even ends
			//vowel or not -starts
			
		case 3:
			System.out.println("3 VOWEL OR NOT");
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
			break;
			
			//vowel ends
			// palindrome or not starts
		case 4:
			System.out.println("4 Palindrome or not");
			int m, nn, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number:");
	        m = s.nextInt();
	        int temp=m;
	        while(m > 0)
	        {
	            nn = m % 10;
	            sum = sum * 10 + nn;
	            m = m / 10;
	        }
	        if(temp==sum) {
	        	System.out.println("Palindrome");
	        }
	        else {
	        	System.out.println("not palindrome");
	        }
			break;
			
		default:
			System.out.println("not a valid oprtion");
			break;
			
			//palindrome ends
		}
	}
	

	}


