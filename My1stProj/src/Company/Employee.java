package Company;

public class Employee {

	String EmpName = "Bharat";
	int Age = 45;
	
	
	public void LName(){
	System.out.println("Employee Last Name : PATEL");	
	}
	public static void main (String [] args){
		
		Employee E = new Employee();
		
		System.out.println("Employee Name : " + E.EmpName );
		E.LName();
		System.out.println("Employee Age  : " + E.Age );
		
		
	}
}
