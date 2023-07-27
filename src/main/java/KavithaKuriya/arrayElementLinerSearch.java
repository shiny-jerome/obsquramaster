package KavithaKuriya;

import java.util.Scanner;

public class arrayElementLinerSearch {

	public static void main(String[] args) {
		 Scanner reader=new Scanner(System.in);
		 System.out.println("enter the size of the array");
		 int b=reader.nextInt();
		 int a[]=new int[b];
		 System.out.println("enter the element of the array ");
		 for(int i=0;i<b;i++) {
			 
			 a[i]=reader.nextInt();
		 }
		 System.out.print("The element to search"); 
		 int search=reader.nextInt();
		 int index = -1;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] == search) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println(search + " found at index " + index);
	        } else {
	            System.out.println(search + " not found in the array.");
	        }

	     
	    }
	}