package A3String_StringBuffer_StringBuilder;

public class Question3 {

	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println("Lowercase: " +str.toLowerCase());
		System.out.println("Uppercase: " +str.toUpperCase());
		System.out.println("Replace a with $: " +str.replace('a', '$'));
		System.out.println("Check 'collection' Word: " +str.contains("collection"));
		
		String str2 = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println("Matching str with str2: " +str.equals(str2));
		System.out.println("Matching by ignoring case str with str2: " +str.equalsIgnoreCase(str2));
	}

}
