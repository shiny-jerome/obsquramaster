package Gopika;

public class AggreAddress {
String city;
int housenum;
AggreStudent student;
AggreAddress (String city,int housenum,AggreStudent student)
{
	this.city=city;
	this.housenum=housenum;
	this.student=student;
}
public static void main(String args[])
{
	AggreStudent s= new AggreStudent("Gopika",1);
	
	AggreAddress a = new AggreAddress("ktm",2,s);
	System.out.println(a.city +"  " +a.housenum);
	
	System.out.println(a.student.name);
	System.out.println(a.student.rno);
	
			
}
}
