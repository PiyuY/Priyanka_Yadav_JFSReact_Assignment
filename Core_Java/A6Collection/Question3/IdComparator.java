package A6Collection.Question3;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
	
}


//Comparator class will override the compare
//method which will compare the tw objects
//passed in the parameter
