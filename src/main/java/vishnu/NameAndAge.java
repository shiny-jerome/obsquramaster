package vishnu;
import java.util.Scanner;
public class NameAndAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=reader.nextLine();
		
		System.out.println("Enter your age");
		int age=reader.nextInt();
		
		System.out.println("Name:"+name + " Age:" +age);

	}

}
