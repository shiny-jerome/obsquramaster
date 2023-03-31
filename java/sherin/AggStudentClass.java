package sherin;

public class AggStudentClass {
String name;
int rollno;
AggStudentAddress add;

 AggStudentClass(String name,int rollno, AggStudentAddress add) {
	
	this.name=name;
	this.rollno=rollno;
	this.add=add;
}
public static void main(String args[])
{
	AggStudentAddress add=new AggStudentAddress(10,"Ros","Divine","Thrissur",680697,"kerala");
	AggStudentClass s=new AggStudentClass("Juan",1,add);
	s.display();
}
	void display()
	{
		System.out.println(this.name);
	System.out.println(this.rollno);
	System.out.println(this.add.houseno);
	System.out.println(this.add.housename);
	System.out.println(this.add.street);
	System.out.println(this.add.dist);
	System.out.println(this.add.pin);
	System.out.println(this.add.state);
	
	
		
	}

}
