package vishnu;
import java.util.Scanner;
public class NameAndAgeUsingMethod {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=reader.next();
		System.out.print("Enter age: ");
		int age=reader.nextInt();
		nameAge(name,age);
	}
	
	public static void nameAge(String name, int age)
	{
		System.out.println("This is "+name+" and he is "+age+ " years old!");
	}
	

}
