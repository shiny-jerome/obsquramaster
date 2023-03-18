package sherin;
import java.util.*;

public class MethodNameAge {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the name");
		String name =reader.nextLine();
		System.out.println("Enter the Age ");
		int age=reader.nextInt();
	
		student(name,age);
	}
public static  void student(String name,int age)
{
	System.out.println("The name is "+name +"   Age is  "+age);
}
}
