//Question 2

package A7Annotations;

import java.lang.annotation.*;  
//import java.lang.reflect.*;  


@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)  
@interface Info {
	
 int AuthorID();
 String Author() default "[unassigned]";
 String Supervisor() default "[unassigned]";
 String Date();
 String Time();
 double Version();
 String Description() default "[unassigned]";
 
}
