package Lekshmiv;

public class ConceptThis {
	
	int empid;
	String name;
	
	public void display()
	{
		System.out.println(this.empid); //method 1 calling instance variables
		System.out.println(this.name);
		this.print(); //method2 calling instance message
	}
	
	public static void main(String args[])
	
	{
		ConceptThis obj=new ConceptThis();
		obj.empid=1;
		obj.name="Lekshmi";
		obj.display(); //obj is the current object so this will refer 
		
	}
	
	public void print()
	{
		System.out.println("print details");
	}
	
	ConceptThis(int empid,String name)
	
	{
		this();  //method 4  calling the non parameterised constructor in the parameterised constructor
		this.empid=empid;
		this.name=name;   //method3 if formal parameter of constructor and instance variables are same
		
	}
ConceptThis()
	
	{
		System.out.println("This is a example to illustarate this");
		
	}
	 
	

	}

