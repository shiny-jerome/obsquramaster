package Lekshmiv;

public class StringEqualsExample {
	String s1="hello";
	String s2="hello";
	String s3="world";
	String s4=new String("hello");
	String s5="world";
	
	System.out.println(s1==s2);//true
	System.out.println(s1==s3);//true
	System.out.println(s1==s4);//false
	System.out.println(s1==s5);//false
	System.out.println(s1.equals(s2));

}
