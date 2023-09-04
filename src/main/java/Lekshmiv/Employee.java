package Lekshmiv;

public class Employee 
{ 
	int empid;
	String name;
	
	public Employee(int id,String n)
	{
		empid=id;
		name=n;
	}
	
	public Employee()
	{
		
	}
	
	public void display() 
	{
		System.out.println(empid);
		System.out.println(name);
		
	}
	public void get(int eid,String ename)
	{
		empid=eid;
		name=ename;
		
		
    }
	
}
