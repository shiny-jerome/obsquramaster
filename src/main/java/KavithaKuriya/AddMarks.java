
package KavithaKuriya;
import java.util.*;

	
	public class AddMarks{

	public static void main(String []args){

	Scanner reader =new Scanner(System.in);
	System.out.println("Enter the Mark for maths");
	int a=reader.nextInt();
	System.out.println("Enter the Mark for malayalam");
	int b=reader.nextInt();
	System.out.println("Enter the Mark for malayalam");
	int c=reader.nextInt();

	int totalmarks =a+b+c;
	System.out.println("the result is"+totalmarks);
	if(totalmarks>100){
	System.out.println("invalid");
	}
	else if(totalmarks>81&&totalmarks<100){
	System.out.println("grade is A");
	}
	else if(totalmarks>71&&totalmarks<80){
	System.out.println("grade is B");
	}
	else if(totalmarks>61&&totalmarks<70){
	System.out.println("grade is C");
	}
	else if(totalmarks>40&&totalmarks<60){
	System.out.println("grade is D");
	}
	else{
	System.out.println("Failed");
	}

	}
	

}
