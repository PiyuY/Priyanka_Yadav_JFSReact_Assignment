package A8Lambda_Expression.Question3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question3 {

	public static void main(String[] args) {

		Predicate<String> predicate = s -> s.length()==8;
		Supplier<String> supplier = () -> "Priyanka";
		Consumer<String> consumer= s -> System.out.println("String is: " + s);
		Function<String,Integer> function = s -> s.length();
	
		System.out.println(predicate.test("hello"));
		System.out.println(supplier.get());
		consumer.accept("Priyanka");
		System.out.println(function.apply("Priyanka"));

	}
}


