package A2OOPS.Question2;

public class Labour extends Employee {
	
	double overTime = 1.5;
	
	void totalSalary(){
		System.out.println("This is Labour Class salary");
		
		double salary = basicSalary + (100 * overTime);
		
		System.out.println("Labour's salary is: " + salary);
	}
}
