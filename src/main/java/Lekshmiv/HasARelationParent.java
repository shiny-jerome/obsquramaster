
/*
 Write a program to get the details of a Student
 Class 1 - Student
Get the student name and roll number
 Class 2- Address
Get the address of student
Print Student name, roll number with address
 There is no IS-A relationship
 */
package Lekshmiv;

public class HasARelationParent {
	
	String name;
	int roll;
	Address add;
	HasARelationParent(String name,int roll,Address add)
	{
		this.name=name;
		this.roll=roll;
		this.add=add;
	}
	public static void main(String args[])
	{
		Address a=new Address("Dale",32,"Kochi");
		HasARelationParent e=new HasARelationParent("Lekshmi",2,a);
		System.out.println("****Student details****");
		System.out.println("Name:"+e.name);
		System.out.println("Roll No:"+e.roll);
		System.out.println("House Name:"+e.add.hname);
		System.out.println("House No:"+e.add.hno);
		System.out.println("City:"+e.add.city);
		
		
	}
	

}
