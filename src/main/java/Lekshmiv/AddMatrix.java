package Lekshmiv;


//Write a program to add two matrices.

	public class AddMatrix

	 {

	   public static void main(String args[])

	    {

	       int a[][]={{1,2,3},{4,5,6},{1,1,2}};

	       int b[][]={{1,2,3},{4,5,6},{1,1,2}};
	       int c[][]={{0,0,0},{0,0,0},{0,0,0}};
	       int i,j;

	     for(i=0;i<3;i++)

	       {

	         for(j=0;j<3;j++)
	     
	           {
	             
	                 System.out.print(a[i][j]);
	                 System.out.print(" ");
	   
	          }

	     System.out.println();

	       }


	  System.out.println();
	  System.out.println();


	  for(i=0;i<3;i++)

	       {

	         for(j=0;j<3;j++)
	     
	           {
	             
	                 System.out.print(b[i][j]);
	                 System.out.print(" ");
	   
	          }

	     System.out.println();

	       }

	  System.out.println();
	  System.out.println();
	     
	  
	for(i=0;i<3;i++)

	       {

	         for(j=0;j<3;j++)
	     
	           {
	             
	                 c[i][j]=a[i][j]+b[i][j];

	                 
	          }

	     

	       }

	    System.out.println("Sum: ");
	  
	   for(i=0;i<3;i++)

	       {

	         for(j=0;j<3;j++)
	     
	           {


	          System.out.print(c[i][j]);
	          System.out.print(" ");

	          }

	          System.out.println();

	       }
	   

	}

	}


	   


