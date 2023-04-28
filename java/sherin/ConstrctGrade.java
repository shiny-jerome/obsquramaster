package sherin;

import java.util.*;
public class ConstrctGrade {
	public static void main(String args[])
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Calculate teh grade of two students basedon total mark of 3 subjects");


			System.out.println("Enter the marks of 3 subjects");
			int m1=reader.nextInt();
			int m2=reader.nextInt();
			int m3=reader.nextInt();
			
			ConstructStudent s1=new ConstructStudent(m1,m2,m3);
			System.out.println("Grade="+s1.grade);
			
			System.out.println("Enter the marks of 3 subjects");
			 m1=reader.nextInt();
			 m2=reader.nextInt();
			 m3=reader.nextInt();
			
			s1=new ConstructStudent(m1,m2,m3);
			System.out.println("Grade="+s1.grade);
			
	}
	}
	


