package sherin;
import java.util.*;
public class Armstrong {
public static void main(String args[])
{
	System.out.println("Enter the number ");
	Scanner reader=new Scanner(System.in);
	int number,temp,sum=0;
	number=reader.nextInt();
	temp=number;
	while(number!=0 )
	{
		int rem=number%10;
		sum=sum+(rem*rem*rem);
		number=number/10;
		
	}
if (temp==sum)
{System.out.println("The entered number  "+temp +  "is an armsrong number");

}
else
{System.out.println("The entered number  "+temp +" is not armstrong number");
}
}
}