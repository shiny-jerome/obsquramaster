package Lekshmiv;

//Write a program to sum up all the elements of an array.

public class AddArray

{


  
 public static void main(String args[])


  {
    int a[]={1,2,3,4,5};
    int s=0;


    for(int i=0;i<a.length;i++)

     {
  
       s=s+a[i];

    System.out.println(a[i]);  

     }

    System.out.println("sum of all the elements of the above array: "+s);

  }

}