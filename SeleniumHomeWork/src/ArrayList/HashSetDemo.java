package ArrayList;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args){
	
		
		HashSet<String> Cars = new HashSet<>();
		
		Cars.add("M.Benz");
		Cars.add("BMW");
		Cars.add("Lexus");
		Cars.add("M.Benz");//Duplicate not allowed 
		
		
		for(String C: Cars) {
			System.out.println(C);
		}		
	}
}
