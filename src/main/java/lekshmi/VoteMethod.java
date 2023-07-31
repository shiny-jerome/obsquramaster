package lekshmi;

//Write a program to check whether the candidate is eligible for Voting(Use static method and 
//boolean return type).

import java.util.Scanner;
class VoteMethod

{
 
 public static boolean vote(int p)

  {

    //boolean t=true;
    if(p>=18)
   {
    return true;
   }
else
  {
   return false;
  }


  }

public static void main(String args[])

{
 boolean s=true;
Scanner reader=new Scanner(System.in);

System.out.println("Enter your age");
int a=reader.nextInt();
 s=vote(a);

 if(s==true)

  {
   System.out.println("The candidate is eligible for voting") ;

  }

else if(s==false)


  {
   System.out.println("The candidate is not eligible for voting") ;

  }

else
{
  System.out.println("invalid age") ;
}

}

}


  
