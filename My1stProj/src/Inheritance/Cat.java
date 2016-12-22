package Inheritance;

// Public class child extends parent/base

public class Cat extends Animals {
	
	//String catfood ="Mouse";
	
	public void hunter(){
		
		System.out.println("A Cat is a Hunter");
	}
	
		public static void main (String args[]){
		
		Cat C = new Cat();
		
		//System.out.println("Number of Legs : " + C.numoflegs);
		//System.out.println("The Color is : " + C.Color);
		//System.out.println("Cat favorite food is : " + C.catfood );
	
	C.hunter();
	
	}

}
