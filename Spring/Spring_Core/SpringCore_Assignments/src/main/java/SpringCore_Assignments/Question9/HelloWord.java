package SpringCore_Assignments.Question9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWord {

	
	// Annotate this method to execute it automatically as the bean is instantiated.
	
    @PostConstruct
    public void init() throws Exception {
        System.out.println("Bean HelloWorld has been " + "instantiated and I'm the " + "init() method");
    }
 
    
    // Annotate this method to execute it when Spring container is closed
    
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Container has been closed " + "and I'm the destroy() method");
    }
	
	
	
}
