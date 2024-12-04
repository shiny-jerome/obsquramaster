package KavithaKuriya;

import java.util.Scanner;


public class nameAgeStatic{
	 private static String name;
	 private static int age;
     public static void personalDetails(String newName,int newAge)
     {
     	name=newName;
     	age=newAge;
     }
    
    public static String getmyName()
    {
		return name;
	    	
    }
    public static int getmyAge()
    {
		return age;
		   	
    }
   
     public static void display()
     {
    	 Scanner reader=new Scanner(System.in);
    	 System.out.println("enter the age");
    	 int newAge=reader.nextInt();
    	 System.out.println("enter the name");
    	 String newName=reader.next();
    	 nameAgeStatic.personalDetails(newName, newAge);
    	    	 
     }
     
     public static void main(String args[]){
    		 display();
    		 String getName=nameAgeStatic.name;
    		 int getAge=nameAgeStatic.age;
    		 System.out.println("Name of the person-------->"+getName);
    		 System.out.println("Age of the person--------->"+getAge);
    		 
    	 
     }
     
	 
	
	
}