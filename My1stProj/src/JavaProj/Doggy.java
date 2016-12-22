package JavaProj;

public class Doggy {
	int DoggyAge;
	public Doggy(String name){
		
	// This constructor has one parameter, name.
	System.out.println("Name chosen is :" + name );
	
	}
	
	public void setAge( int age ){
	
		DoggyAge = age;
	}
	
	public int getAge( ){
	
		System.out.println("Puppy's age is :" + DoggyAge );
	return DoggyAge;
	
	}
	
	public static void main(String []args){
	/* Object creation */
	Doggy myDoggy = new Doggy( "Tommy" );
	/* Call class method to set puppy's age */
	myDoggy.setAge( 2 );
	/* Call another class method to get puppy's age */
	myDoggy.getAge( );
	/* You can access instance variable as follows as well */
	
	System.out.println("Variable Value :" + myDoggy.DoggyAge );
	
	}
	}

