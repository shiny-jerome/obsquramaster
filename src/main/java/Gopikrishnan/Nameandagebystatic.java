package Gopikrishnan;

public class Nameandagebystatic {
	Nameandagebystatic nm=new Nameandagebystatic();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test=nameage();
		print(test);
	

	}
	static String nameage() {
		 String name="gopi 25";
		 
		 return name;
		
	}
	static void print(String nam) {
		System.out.println(nam);
		
		
	}

}
