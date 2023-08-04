package Lekshmiv;

/*26. Write a program to deposit and withdraw amount from bank account(Withdrawal amount do not 
exceeds the current balance). Add an extra method to check the account balance. (static 
methods)*/

import java.util.Scanner;
public class Bank

{

  float bal=0;
  
public void depoist(float dep)

{

   bal=bal+dep;
   


}

public void withdraw(float wit)

{
   if(wit<bal)
    {
   bal=bal-wit;
    }
else if(wit>bal)
   {
  System.out.println("Withdrawal amount do not exceeds the current balance");
   }
else
  {
   System.out.println("Invalid amount");
  }
}

public void displaybal()

 {
  System.out.println("current balance is"+bal);
 }



public static void main(String str[])

  {
    char c;
    Bank obj=new Bank();

   do

    {
    System.out.println("1.deposit");
    System.out.println("2.withdraw");
    System.out.println("3.balance check");
     
    System.out.println("Enter an option");

    Scanner reader=new Scanner(System.in);
    int a=reader.nextInt();
   
switch(a)
    {

    case 1: 
           
            System.out.println("enter the amount to be deposited");
            float d=reader.nextFloat();
            obj.depoist(d);
            break;
            
   case 2:  
            System.out.println("enter the amount to be withdrawed");
            float s=reader.nextFloat();
            obj.withdraw(s);
            break;

    case 3: 

          obj.displaybal();
          break;

    }

 System.out.println("Do you want to continue(y/n)");
 c=reader.next().charAt(0);

 }
while(c!='n');
 
 }
}
    

     


  

  



  
