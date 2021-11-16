package A3String_StringBuffer_StringBuilder;

public class Question1and2 {

	public static void main(String[] args) {
		// Question 1
		String str = "Hello World";
		System.out.println("Length of string str is: " + str.length());
		
		// Question 2
		String str1 = "Hello, ";
		String str2 = "How are you?";
		System.out.println("Joining of string " +str1+ " & " +str2+  " : " + str1.concat(str2));
		
		System.out.println("Hello, ".concat("How are you?"));
	}

}
