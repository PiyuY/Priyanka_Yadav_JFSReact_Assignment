package A8Lambda_Expression.Question7;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Question7 {

	public static void main(String[] args) {
		
		Map<Integer, String> words = new HashMap<Integer, String>();
		
		words.put(1, "Horse");
		words.put(2, "Dog");
		words.put(3, "Cat");
		words.put(4, "Elephant");
		words.put(5, "Lion");
		words.put(6, "Rabbit");
		words.put(7, "Peacock");
		words.put(8, "Butterfly"); 
		
		StringBuilder str = new StringBuilder();
		BiConsumer<Integer,String> consumer = (key, value) -> str.append(key + value);

		words.entrySet().forEach(e -> consumer.accept(e.getKey(), e.getValue()));
		
		System.out.println("Final string : " + str);	

	}

}
