package Company;

public class Department extends Employee {
			
	int DepID = 3003;
	String DeptName = "IT";
	
	public static void main (String [] args){
		
		Department D = new Department() ;
		
		System.out.println("Employee Name : " + D.EmpName );
		System.out.println("Employee Age  : " + D.Age );
		System.out.println("Department ID : " + D.DepID);
		System.out.println("Departarment Name : " + D.DeptName);
		//System.out.println("Employee Salary : " + D. ");
	}
	
}
