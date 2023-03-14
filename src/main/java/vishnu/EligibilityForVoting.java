package vishnu;
import java.util.Scanner;
public class EligibilityForVoting {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter the age of the cantidate: ");
		int age=reader.nextInt();
		boolean eligible=eligibility(age);
		
		
		if(eligible)
		{
			System.out.println("The candidate is eligible for voting");
		}
		else
		{
			System.out.println("The candidate is not eligible for voting");
		}
		

	}
	public static boolean eligibility (int age)
	{

		boolean eligible=false;
		if(age>=18)
		{
			eligible=true;
		}
		return eligible;
	}

}
