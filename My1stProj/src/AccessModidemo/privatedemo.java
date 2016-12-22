package AccessModidemo;

class A {

		private int data = 50;
		private void msg(){
			
			System.out.println("Love you OM-URVA");
		}
	}
	
public class privatedemo {
public static void main(String[] args) {
		
		A obj = new A();
		
		// The method not accessed after obj. because the Access modifier is a "private" 
		//obj.msg();
	}
}
