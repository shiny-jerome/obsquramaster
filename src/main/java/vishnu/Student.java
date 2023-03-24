package vishnu;

public class Student {

	String studentName;
	int rollNo;
	Address address;
	
	Student(String studentName,int rollNo,Address address)
	{
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.address=address;
	}
	public static void main(String[] args) {
		Address address=new Address(1212,"ABC","XYZ",1234);
		Student obj1=new Student("Vishnu",1,address);
		obj1.print();
	}
	void print()
	{
		System.out.println(this.studentName);
		System.out.println(this.rollNo);
		System.out.println(this.address.houseNo);
		System.out.println(this.address.houseName);
		System.out.println(this.address.state);
		System.out.println(this.address.pin);
	}
	
}
