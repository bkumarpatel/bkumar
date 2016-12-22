package Inheritance;

abstract class shape {

	//abstract method
	abstract void draw();
	
	// Regular method/concrete method
	void msg(){
		System.out.println("Hi OM");
	}
}

public class abstractdemo extends shape{
	@Override
	
	void draw(){
		
		System.out.println("Draw a Circle");
	}
	public static void main(String[] args) {
		
		abstractdemo obj = new abstractdemo();
		obj.draw();
	}
}