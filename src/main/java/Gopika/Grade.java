package Gopika;

import java.util.Scanner;

public class Grade {


public static void main(String args[])
{
Scanner reader = new Scanner(System.in);
System.out.println("Enter Mark of subject1");
int m1 = reader.nextInt();
System.out.println("Enter Mark of subject2");
int m2 = reader.nextInt();
System.out.println("Enter Mark of subject3");
int m3 = reader.nextInt();
System.out.println("Enter Mark of subject3");
int M = m1+m2+m3;
System.out.println("Total Marks="+M);
if (M<40)
{
System.out.println("Failed");
}
else if(M>40 && M<60)
{
System.out.println("Grade D");
}
else if(M>61 && M<70)
{
System.out.println("Grade C");
}
else if(M>71 && M<80)
{
System.out.println("Grade B");
}
else if(M>81 && M<100) 
{
System.out.println("Grade A");
}
else
{
System.out.println("Invalid Mark");
}
}
}