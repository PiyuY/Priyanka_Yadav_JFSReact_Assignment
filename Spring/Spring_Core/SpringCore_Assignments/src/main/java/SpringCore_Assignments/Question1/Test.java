package SpringCore_Assignments.Question1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringCore_Assignments/Question1/Beans.xml");
		Customer c = (Customer)context.getBean("customer");
		c.display();
//		System.out.println(c);
		context.close();
	}

}
