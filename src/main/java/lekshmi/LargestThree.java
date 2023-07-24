package lekshmi;
import java.util.Scanner;

public class LargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a =reader.nextInt();
		System.out.println("Enter the second Number");
		int b =reader.nextInt();
		System.out.println("Enter the third Number");
		int c =reader.nextInt();
		if(a>b && a>c)
		{
		System.out.println("A  is Large" +a);
		}
		else if(b>a && b>c)
		{
		System.out.println("B  is Large" +b);
		}
		else
		{
		System.out.println("C  is Large" +c);
		}
		}

	
	}


