package vishnu;
import java.util.Scanner;
public class User {
	
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your PIN");
		int num=reader.nextInt();
		
		Bank obj=new Bank();
		obj.setPin(num);
	}

}
