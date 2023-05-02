package Gopikrishnan;
import java.util.Scanner;

public class simpleif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("enter a number");
		int num1=reader.nextInt();
		if(num1<0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("positive number");
		}
	}

}
