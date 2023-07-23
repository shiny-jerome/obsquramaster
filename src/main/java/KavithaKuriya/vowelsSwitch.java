package KavithaKuriya;

import java.util.*;
public class vowelsSwitch{

	public static void main(String [] args){
	 Scanner reader =new Scanner(System.in);
	 System.out.println("enter a character");
	 char a =reader.nextLine().charAt(0);
	 switch(a){

	 case 'a':
	 case 'A':
	 System.out.println("The enterd character is vowels");
	break;
	case 'e':
	 case 'E':
	 System.out.println("The enterd character is vowels");
	break;
	case 'i':
	 case 'I':
	 System.out.println("The enterd character is vowels");
	break;
	case 'o':
	 case 'O':
	 System.out.println("The enterd character is vowels");
	break;
	case 'u':
	 case 'U':
	 System.out.println("The enterd character is vowels");
	break;
	default:
	System.out.println("not a vowels");
	}

	}
	}

