package Juice;

class FreshJuice {

	
enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
 FreshJuiceSize Size;

 
}

public class FreshJuiceTest {
	
	public static void main(String args[]){
		FreshJuice juice = new FreshJuice();
		juice.Size = FreshJuice.FreshJuiceSize.LARGE ;
		System.out.println("Size: " + juice.Size);
		
		}	

}
