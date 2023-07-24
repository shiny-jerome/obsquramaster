package lekshmi;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner reader=new Scanner(System.in);
     System.out.println("Enter the mark1");
     int m1=reader.nextInt();
     System.out.println("Enter the mark2");
     int m2=reader.nextInt();
     System.out.println("Enter the mark3");
     int m3=reader.nextInt();
     System.out.println("Enter the mark4");
     int m4=reader.nextInt();
     int totalmarks=m1+m2+m3+m4;;
          if(totalmarks<40)
     {
    	 System.out.println("Failed");
    	 
     }
     else if(totalmarks>40 && totalmarks<60)
     {
    	 System.out.println("Grade D");
    	 
     }
     else if(totalmarks>61 && totalmarks<70)
     {
    	 System.out.println("Grade C");
    	 
     }
    else if(totalmarks>71 && totalmarks<80)
     {
    	 System.out.println("Grade B");
    	 
     }
     else if(totalmarks>81 && totalmarks<100)
     {
    	 System.out.println("Grade A");
    	 
     }
     else 
     {
    	 System.out.println("Invalid");
    	 
     }
     
	}
     
     }
	
	
	
	
    
