package lekshmi;

class BubbleSort

{

 public static void main(String args[])
  
  {

    int a[]={1,2,7,4,9,18,5,3};

    int temp=0,i,j;

    int n=a.length;

 System.out.println("before sort: ");
  
  for(i=0;i<a.length;i++)
  {
      System.out.print(a[i]);
      System.out.print(" ");
  }

     for(i=0;i<n;i++)
      {
       for(j=1;j<(n-i);j++)

         {
        if(a[j-1] > a[j])
            {  
                                //swap elements  
                                temp = a[j-1];  
                                a[j-1] = a[j];  
                                a[j] = temp;  
             }

       }

     }
  System.out.println();
 System.out.println("After sort: ");
  for(i=0;i<a.length;i++)
     {
   
      System.out.print(a[i]);
      System.out.print(" ");
  }
  }

}

