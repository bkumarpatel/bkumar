package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args){
	
		
		ArrayList<String> Cities = new ArrayList<>();
		Cities.add("Vadodara");
		Cities.add("Toronto");
		Cities.add("Moncton");
		Cities.add("Toronto");
		
		
		for(String t:Cities){
			System.out.println(t);
		}
		
		
		
	}
}
