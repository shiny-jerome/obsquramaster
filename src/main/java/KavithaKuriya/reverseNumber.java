package KavithaKuriya;


import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		char [] text;
		int i;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number that you want to revser");
		int input =reader.nextInt();
		String str1 = Integer.toString(input);
		text=str1.toCharArray();
		for(i=text.length-1;i>=0;i--){
			System.out.print(text[i]);
		
	}
		
	}

}
