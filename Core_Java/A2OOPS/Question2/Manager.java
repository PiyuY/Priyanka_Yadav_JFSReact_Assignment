package A2OOPS.Question2;

public class Manager extends Employee {
	
	double incentive = 5000;
	
	void totalSalary(){
		System.out.println("This is Manager Class salary");
		
		double salary = basicSalary + incentive;
		System.out.println("Manager's salary is: " + salary);
	}
}
