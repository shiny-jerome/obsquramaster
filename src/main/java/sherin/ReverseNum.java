package sherin;
import java.util.*;

public class ReverseNum {
	public static void main(String args[])
	{
		System.out.println("Enter the number \n");
		Scanner reverse=new Scanner(System.in);
		int num=reverse.nextInt()	;
		int revnum=0;
		while(num!=0)
		{
int reminder=num%10;
revnum=revnum*10+reminder;
num=num/10;

}
		System.out.println("The reverse number "+revnum);
}
}