package BcpProjs;

public class Calculate {

	// Overloading by changing the number of arguments
	public void sum (int a,  int b){
		
		System.out.println( "Sum of 2 numbers : " + (a+b));
	}
	
	public void sum (int a, int b, int c, int d) {
		
		System.out.println("Sum of 3 numbers : " + (a*b*c/d));
	}
	
	// Overloading by changing the data type
	
public void add (double a, double b){
		
		System.out.println( "Sum of 2 numbers : " + (a+b));
	}


	// OVerloading by changing the return type alone

	//void calc(int a, int b){
		//System.out.println(a+b);
	//}
	
	//int calc(int a, int b){
		//System.out.println(a+b);
	//}
	
	
	public static void main (String args[]) {
		
		Calculate Obj1 = new Calculate ();
	    
		Obj1.sum(3, 4);
		Obj1.sum(15, 25, 35, 10);
	    
		Obj1.add(10.0, 5.0);

		
	}
	
}
