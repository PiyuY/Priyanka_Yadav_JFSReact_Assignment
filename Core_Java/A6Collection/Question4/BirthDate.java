package A6Collection.Question4;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;

public class BirthDate {
	
	public static void main(String[] args) throws ParseException {
		LinkedList<LocalDate> dd = new LinkedList<LocalDate>();
		
		dd.add(LocalDate.of(2016,07,23));
		dd.add(LocalDate.of(1999,02,01));
		dd.add(LocalDate.of(2000,12,05));
		dd.add(LocalDate.of(2019,10,24));
		dd.add(LocalDate.of(1974,07,30));
		dd.add(LocalDate.of(1996,11,18));
		

		
		//Traversing the linked list  objects in reverse order  
        Iterator<LocalDate> itr= dd.descendingIterator();  
        while(itr.hasNext())  
        {  
            LocalDate d = itr.next();  
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fd = d.format(formatter);
           
            
            if (d.isLeapYear()) {
            	System.out.println("Your date of birth is " + fd + " and it was a leap year.");
			}
            else {
            	System.out.println("Your date of birth is " + fd + " and it was not a leap year.");
			}
        }  
		
	}

}
