package vishnu;

import java.util.Scanner;

public class SumofTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader=new Scanner (System.in);
		
		System.out.println("Enter Two numbers");
		int first=reader.nextInt();
		int second=reader.nextInt();
		int sum=first+second;
		
		System.out.println("Sum:" +sum);

	}

}
