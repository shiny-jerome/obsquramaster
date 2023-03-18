package vishnu;
import java.util.Scanner;
public class StringPalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=reader.next();
		
		StringPalindrome obj=new StringPalindrome(word);

	}

}
