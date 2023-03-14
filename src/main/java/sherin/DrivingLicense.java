package sherin;
import java.util.*;

public class DrivingLicense {
	public static void main(String args[])
	{
System.out.println("Enter the age ");
Scanner reader=new Scanner(System.in);
int age=reader.nextInt();
if (age >=18 && age<93)
	System.out.println(" Eligabe for driving License");
else
	System.out.println("Not eligible for driving license");
}
}
