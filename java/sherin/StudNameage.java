package sherin;
import java.util.Scanner;

public class StudNameage {
	
	
	public static void main (String args[])
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter name");
	String name= reader.nextLine();
	System.out.println("Enter age");
	int age =reader.nextInt();
	System.out.println(" Name="+name +" Age="+age);
	}
	}


