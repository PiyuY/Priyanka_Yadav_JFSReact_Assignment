package A8Lambda_Expression.Question6;

import java.util.ArrayList;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		
		words.add("Horse");
		words.add("Dog");
		words.add("Cat");
		words.add("Elephant");
		words.add("Lion");
		words.add("Rabbit");
		words.add("Peacock");
		words.add("Butterfly"); 
		
		System.out.println(words);
		
		words.replaceAll( w -> w.toUpperCase() );
		System.out.println("\nResult is: " + words);

	}

}
