package Lekshmiv;

/*30. Write a program to find the grade of 2 students based on total marks(3 subjects) 
 Get the student‟s marks by constructor
 Return total mark to in main method
 Find the grade of each student.*/
//import java.util.*;
class MarksConsructor

 {
   int total=0;

   MarksConsructor(int m1,int m2,int m3)

    {
     
     total=m1+m2+m3;
     }

  
 public static void findGrade(int a)

      {

        if(a>100)
           {
             System.out.println("Invalid");
           }
         else if(a<100&&a>=80)
              {
             System.out.println("Grade A");
              }
         else if(a<80&&a>=70)
              {
             System.out.println("Grade B");
              }
      else if(a<70&&a>=60)
              {
             System.out.println("Grade C");
              }
      else if(a<60&&a>=50)
              {
             System.out.println("Grade D");
              }
       else
              {
             System.out.println("Failed");
              }
        }
   public static void main(String args[])

    {
       
      MarksConsructor b1=new MarksConsructor(10,20,30);

      MarksConsructor b2=new MarksConsructor(30,20,40);
      System.out.println("Grade of student1 is: ");
      findGrade(b1.total);
      System.out.println("Grade of student2 is: ");
      findGrade(b2.total);
     
     }
}

      





  