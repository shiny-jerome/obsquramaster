package KavithaKuriya;

import java.util.Scanner;


//. Write a program to check whether the candidate is eligible for Voting(Use static method and 
//boolean return type).
public class candidateVote {
	
	public static boolean getisEligible(int age)
	{
		return age>=18;
	}
	public static void Eligible() {
		Scanner reader=new Scanner(System.in);
		System.out.println("enter your age");
		int youAge=reader.nextInt();
		
		boolean eligible = getisEligible(youAge);
		
		if(eligible) {
		 System.out.println("Eligible for the voting");
	 }
		else
		{
			System.out.println("Not Eligible for the voting");
		}
	}
	public static void main(String args[]) {
		Eligible();
	}

}
