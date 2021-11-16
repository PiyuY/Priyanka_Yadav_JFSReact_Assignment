package SpringCore_Assignments.Question9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q9Main {

	public static void main(String[] args) {

		/* Loading the Spring XML configuration file into Spring container and 
		   it will create the instance of the bean as it loads into container*/
		
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext(
        		"SpringCore_Assignments/Question9/Q9File.xml");
 
        // It will close the Spring container and as a result invokes the destroy() method
        cap.close();

	}

}
