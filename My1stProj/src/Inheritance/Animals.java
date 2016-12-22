package Inheritance;


// This common Animals Class you can used in any Class by using "extends" method ;

public class Animals {
	
	int numoflegs=4;
	
	String Color = "Black";
	
        public void hunter(){
		
		System.out.println("A Cat is a great Hunter");
	}

		public static void main (String args[]){
		
		Animals A = new Animals();
		
		System.out.println("The Number of Legs is : " + A.numoflegs);
		System.out.println("The Color is : " + A.Color);
		
		A.hunter();
	}
}
