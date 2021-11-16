package A8Lambda_Expression.Question4;

import java.util.ArrayList;
import java.util.List;

public class Question4Main {

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
		
		words.removeIf(w -> w.length()%2 == 1);
		System.out.println("Even length words are: \n");
		System.out.println("1st way\n" + words);
		System.out.println("\n2nd way");
		words.stream().forEach(w -> System.out.println(w));

	}

}
