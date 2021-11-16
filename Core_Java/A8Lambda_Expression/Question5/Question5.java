package A8Lambda_Expression.Question5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question5 {

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
		
		StringBuilder str = new StringBuilder("");
		Consumer<String> consumer = s -> str.append(s.charAt(0));
		words.forEach(w -> consumer.accept(w));
		System.out.println("Final String is: " + str);
	}

}
