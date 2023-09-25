package Gopika;
//Q42
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListColors {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("red");
	list.add("blue");
	list.add("green");
	list.add("yellow");
	System.out.println(list.contains("yellow")+"Element found at index"+ list.indexOf("yellow"));

	//System.out.println(list.get(0));// bto retreive an element from array list
	//System.out.println(list.get(1));
	System.out.println(list.remove(2));//c
	//c
Iterator<String> itr =  list.iterator();	

	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println(list.contains("yellow")+"Element found at index"+ list.indexOf("yellow"));
		
}
}
