package A7Annotations; 

@Info(AuthorID=2, Date = "13 FEB 1998", Time ="11:30 AM", Version =1.5F) 
public class AuthorInfo {
	public static void main(String[] args) {
	
			getId();
		 
	}
	
	@Info(AuthorID=2, Date = "13 FEB 1998", Time ="11:30 AM", Version =1.5F) 
	public static void getId() {
		System.out.println("This is annotated method");
	}
}
