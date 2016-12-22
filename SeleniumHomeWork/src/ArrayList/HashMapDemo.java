package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) {
		
		HashMap<String, Integer> Marks = new HashMap<>();
		
		Marks.put("Bharat", 98);
		Marks.put("OM", 100);
		Marks.put("Urva", 99);
		Marks.put("Bharat", 98);//Duplicate value
		
			for(Map.Entry M :Marks.entrySet()){
				
				System.out.println(M.getKey() + " - " + M.getValue());
			}
	}

}
