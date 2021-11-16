package A6Collection.Question3;

//import java.util.Collections;
//import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeMain {
	
	public static void addData(TreeSet<Employee> ee) {
		ee.add(new Employee(1, "Ajinkya", "HR", 45000.50));
		ee.add(new Employee(2, "Ram", "Development", 60000.50));
		ee.add(new Employee(3, "Reva", "Marketing", 35000.76));
		ee.add(new Employee(5, "Babu", "Testing", 45000));
		ee.add(new Employee(4, "Sham", "Management", 40000.50));
		ee.add(new Employee(6, "Vimala", "Help Desk", 40000.50));
		ee.add(new Employee(7, "Sweetu", "Development", 65000.50));
		ee.add(new Employee(9, "Latika", "Development", 60000.50));
		ee.add(new Employee(10, "Kushal", "Testing", 45000));
		ee.add(new Employee(8, "Rehan", "Testing", 40000));
	}

	public static void main(String[] args) {

		
		TreeSet<Employee> ee = null;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fields for sorting: \n a)ID \n b)Name \n c)Salary \n d)Department");
		System.out.print("Select any one option: ");
		String choice = sc.next();
		
		switch (choice) {
		case "a": {
			ee = new TreeSet<Employee>(new IdComparator());
			break;
		}
		case "b": {
			ee = new TreeSet<Employee>(new NameComparator());
			break;
		}
		case "c": {
			ee = new TreeSet<Employee>(new SalaryComparator());
			break;
		}
		case "d": {
			ee = new TreeSet<Employee>(new DepartmentComparator());
			break;
		}
		default:
			System.out.println("Enter valid option.");
		}
		
		addData(ee);
		
		for (Employee e : ee) {
			System.out.println(e);
		}
		
	}

}
