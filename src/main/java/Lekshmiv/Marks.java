package Lekshmiv;
import java.util.Scanner;
public class Marks {
	
	public static void main(String args[])

	{

	Scanner reader=new Scanner(System.in);
	System.out.println("enter 3 marks");
	int m1=reader.nextInt();
	int m2=reader.nextInt();
	int m3=reader.nextInt();
	int d=m1+m2+m3;
	System.out.println("Total marks: "+d);
	if(d>100)
	{
	System.out.println("invalid");
	}
	else if(d>40&&d<60)
	{
	System.out.println("Grade D");
	}
	else if(d>=60&&d<70)
	{
	System.out.println("Grade C");
	}
	else if(d>=70&&d<80)
	{
	System.out.println("Grade B");
	}
	else if(d>=80&&d<=100)
	{
	System.out.println("Grade A");
	}
	else{
	System.out.println("Failed");
	}
	}

}
