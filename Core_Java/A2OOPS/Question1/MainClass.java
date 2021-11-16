package A2OOPS.Question1;

public class MainClass {
	public static void main(String args[]) {
		SingletonExample se2 = SingletonExample.getObject();
		System.out.println(se2.getMessage());
		
		se2.setMessage("This is new message");
		
		SingletonExample se3 = SingletonExample.getObject();
		System.out.println(se3.getMessage());
	}
}
