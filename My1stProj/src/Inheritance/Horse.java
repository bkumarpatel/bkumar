package Inheritance;

public class Horse extends Animals {
	
	//int numoflegs  = 4 ;
	
	public void Runner(){
		System.out.println("Hourse is Running Fast");
	}
	
	public static void main (String args[]){
		
		Horse H = new Horse();
		
		System.out.println("Numer of legs : " + H.numoflegs);
		
		
		H.Runner();
	}

}
