package A5Generics;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMain {
    public static void main(String args[]) {

        Set<Employee> employees = new HashSet<Employee>();
        employees.add( new Employee(1, "Priya", 100000, "UI/UX") );
        employees.add( new Employee(2, "Rohit", 90000, "Full Stack Development") );

        // iterating through employees using for-each loop
        for(Employee emp: employees) {
            emp.displayDetails();
         }
    }
}
