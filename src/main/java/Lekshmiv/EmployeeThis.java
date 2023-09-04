package Lekshmiv;

public class EmployeeThis {

	
		int empiD;
		String name;
		EmployeeThis()
		{
			this(10,"shiny");
			
			System.out.println("Default consructor");
		}
		
		EmployeeThis(int empiD,String name)
		{
			this(10.5f);
			this.empiD=empiD;
			this.name=name;
		}
		
		EmployeeThis(float f)
		{
			
		}
		
		public static void main(String[] args) {
			EmployeeThis e=new EmployeeThis(10,"Shiny");
			System.out.println(e.empiD);
				}
		
		
		public void display()
		{
			
			System.out.println(empiD);
			this.print();
			Add a=new Add();//creating object of add class
			
	        a.print("print");
			EmployeeThis e=new EmployeeThis(10,"Shiny");
			a.search(this);//sending the object of employee to add class 

		}
		public Employee print()
		{
			return this;
		}

	}

}
