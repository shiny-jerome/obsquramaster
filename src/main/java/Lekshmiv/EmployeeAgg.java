package Lekshmiv;

public class EmployeeAgg {
	
	String name;
	int id;
	AddressAgg AddressAgg;
	
	
EmployeeAgg(int id,String name,AddressAgg AddressAgg)
{
	this.id=id;
	this.name=name;
	this.AddressAgg=AddressAgg;
}

public static void main(String args[])
{
	AddressAgg adr=new AddressAgg(1,"dale","kochi");
	EmployeeAgg e=new EmployeeAgg(1,"Lekshmi",adr);
	System.out.println(e.id);
	System.out.println(e.name);
	System.out.println(e.AddressAgg.houseName);
	System.out.println(e.AddressAgg.hosuseNo);
	System.out.println(e.AddressAgg.city);
}

}