package KavithaKuriya;


import java.util.*;
public class findlargest{

public static void main(String [] args){

Scanner reader=new Scanner(System.in);
System.out.println("enter the three number");
int a=reader.nextInt();
int b=reader.nextInt();
int c=reader.nextInt();
if(a>b && a>c){
System.out.println("A is big");
}else if(b>a && b>c){
System.out.println("B is big");
}else{
System.out.println("C is big");
}

}

}