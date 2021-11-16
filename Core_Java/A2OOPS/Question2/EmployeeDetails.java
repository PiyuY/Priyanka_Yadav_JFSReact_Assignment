package A2OOPS.Question2;
	
	public class EmployeeDetails {	
	public static void main(String args[]) {
		Employee ee;
		ee = new Employee();
		ee.totalSalary();
		
		ee = new Manager();
		ee.totalSalary();
		
		ee = new Labour();
		ee.totalSalary();
	}
}
