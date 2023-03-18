package sherin;
import java.util.*;

public class StringPalindrom {
	
	
public static void main(String args[])
{

System.out.println("Enter the string to check wheather it is palindrome or not ");
Scanner reader=new Scanner(System.in);
 String actual=reader.nextLine();
palindrom(actual);
 
}
public static void  palindrom(String actual)
{
	String temp=actual;

String reverse= revstring(actual );
if (actual.equals(reverse))

{
	System.out.println("The entered string is "+actual +"  is palindrome ");
}
else
{
	System.out.println("The entered string is "+actual+"  is not palindrome ");
	}

}
public static  String  revstring(String actual)
{
	String reverse="";
	
int length=actual.length();
for(int i=(length-1);i>=0;i--)
{
reverse=reverse+actual.charAt(i);
}
return reverse;

}
}

