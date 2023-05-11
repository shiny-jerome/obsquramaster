package Gopikrishnan;
import java.util.Scanner;

public class Palindromemethodstatic {
	
	Palindromemethodstatic pd=new Palindromemethodstatic();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int m;
        m = s.nextInt();
		
		int reve=reverse(m);
		check(reve,m);
		

	}
	
	public static int reverse(int n) {
			// TODO Auto-generated method stub
			int reverse=0;
			int num=n;
	        
	       
	        while(reverse > 0)
	        {
	            int temp = num % 10;
	            reverse = reverse * 10 + temp;
	            num = num / 10;
	        }
	        System.out.println(num);
	       
	        return num;
	}
	public static void check(int tempp,int summ) {
	        if(tempp==summ) {
	        	System.out.println("Palindrome");
	        }
	        else {
	        	System.out.println("not palindrome");
	        }
	        //System.out.println("enterd: "+temp);
	        //System.out.println("reverse: "+sum);
		}

	}


