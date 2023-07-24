package Aparna;

import java.util.Scanner;

public class GradeConstructor
{
static int s1,s2,s3;
static float E1,E2,E3;
int total;
	public static void main(String[] args)
	{
		GradeConstructor obj=new GradeConstructor(40,90,85);
		GradeConstructor obj1=new GradeConstructor(81.7f,97.2f,89.9f);
	
		total();
		
	}
	GradeConstructor(int maths,int science,int english)
	{
		s1=maths;
		s2=science;
		s3=english;
		System.out.println("student1:The Maths mark is:"+s1);
		System.out.println("student1:The Science mark is:"+s2);
		System.out.println("student1:The English mark is:"+s3);
		
	}
	GradeConstructor(float maths,float science,float english)
	{
		E1=maths;
		E2=science;
		E3=english;
		System.out.println("Student 2:The Maths mark is:"+E1);
		System.out.println("Student 2:The Science mark is:"+E2);
		System.out.println("Student 2:The English mark is:"+E3);
	}
	public static void total()
	{
		int Tot1=s1+s2+s3;
		float Tot2=E1+E2+E3;
		System.out.println(Tot1);
		System.out.println(Tot2);
		

        if(Tot1<=120)
      {
	System.out.println("Failed");
      }
        else if(Tot1<=149&&Tot1>=121)
        {
        	System.out.println("Grade D");
        }
        else if(Tot1<=199&&Tot1>=150)
        {
        	System.out.println("Grade c");
        }
        else if(Tot1<=249&&Tot1>=200)
        {
        	System.out.println("Grade B");
        }
        else if(Tot1<=300&&Tot1>=250)
        {
        	System.out.println("Grade A");
        }
        else
        {
        	System.out.println("Invalid Marks");
        }
        if(Tot2<=120)
        {
  	System.out.println("Failed");
        }
          else if(Tot2<=149&&Tot2>=121)
          {
          	System.out.println("Grade D");
          }
          else if(Tot2<=199&&Tot2>=150)
          {
          	System.out.println("Grade c");
          }
          else if(Tot2<=249&&Tot2>=200)
          {
          	System.out.println("Grade B");
          }
          else if(Tot2<=300&&Tot2>=250)
          {
          	System.out.println("Grade A");
          }
          else
          {
          	System.out.println("Invalid Marks");
          }
   
 
	}
}
