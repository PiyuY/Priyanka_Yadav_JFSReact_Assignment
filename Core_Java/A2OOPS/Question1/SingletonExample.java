package A2OOPS.Question1;

//final is used to prevent inheritance
public final class SingletonExample {

	private String message;
	
	//Static & Private Object declared
	private static SingletonExample se; 
	
	//Constructor
	private SingletonExample(String x) {
		message = x;
	}

	static SingletonExample getObject() {
		if (se == null) {
			se = new SingletonExample("This is example of singleton class");
			System.out.println("object actually created");
		}
		return se;
	}
	
	public String getMessage() {
		return message;
	}
	
	
	public void setMessage(String msg) {
		message = msg;
	}
	
	
}



/*
Steps to Create Singleton Class
1. You have to make all the constructors (including the default no-argument constructor) as private.
2. Write a static method that has return type object of this singleton class.
*/