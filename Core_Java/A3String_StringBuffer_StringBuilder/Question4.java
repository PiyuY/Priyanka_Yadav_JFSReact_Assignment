package A3String_StringBuffer_StringBuilder;

public class Question4 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("StringBuffer ");
		StringBuffer s2 = new StringBuffer("is a peer class of String ");
		StringBuffer s3 = new StringBuffer("that provides much of ");
		StringBuffer s4 = new StringBuffer("the functionality of strings");
		s1.append(s2);
		s1.append(s3);
		s1.append(s4);
		System.out.println(s1);
		
		
		StringBuffer s5 = new StringBuffer("insert text");
		StringBuffer s6 = new StringBuffer("It is used to _ at the specified index position");
		s6.insert(s6.indexOf("_"), s5);
		System.out.println(s6);
		
		StringBuffer s7 = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("Reverse String is: " +s7.reverse());
	}

}
