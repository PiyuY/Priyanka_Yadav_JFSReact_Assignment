package A3String_StringBuffer_StringBuilder;

public class Question5 {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("StringBuffer ");
		StringBuilder s2 = new StringBuilder("is a peer class of String ");
		StringBuilder s3 = new StringBuilder("that provides much of ");
		StringBuilder s4 = new StringBuilder("the functionality of strings");
		s1.append(s2);
		s1.append(s3);
		s1.append(s4);
		System.out.println(s1);
		
		
		StringBuilder s5 = new StringBuilder("insert text");
		StringBuilder s6 = new StringBuilder("It is used to _ at the specified index position");
		s6.insert(s6.indexOf("_"), s5);
		System.out.println(s6);
		
		StringBuilder s7 = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println("Reverse String is: " +s7.reverse());

	}

}
