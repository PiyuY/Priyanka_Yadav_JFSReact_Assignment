package A9Stream_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStreamExample {

	public static void main(String[] args) {
		List<Fruit> fruitList = new ArrayList<Fruit>();
		fruitList.add(new Fruit("Apple", 150, 25, "Red"));
		fruitList.add(new Fruit("Strawberry", 250, 65, "Red"));
		fruitList.add(new Fruit("Apple", 90, 20, "Green"));
		fruitList.add(new Fruit("Orange", 100, 15, "Orange"));
		fruitList.add(new Fruit("Banana", 200, 5, "Yellow"));
		fruitList.add(new Fruit("Kiwi", 80, 50, "Green"));
		
		//Question1
		List<Fruit> filteredFruits = fruitList.stream()
				.filter(f -> f.calories < 100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.toList(); // collecting as list  
		System.out.println("\nQuestion1\n" + filteredFruits);
		
		
		
		//Question2
		 Map<String, List<String>> colorFruits = fruitList.stream()
				 .collect(Collectors.groupingBy(Fruit::getColor, 
						 Collectors.mapping(Fruit::getName, Collectors.toList()))
	             );
		 System.out.println("\nQuestion2\n" + colorFruits);
		 

		 
		//Question3
		List<Fruit> redFruits = fruitList.stream()
				.filter(f -> f.getColor().equals("Red"))
				.sorted(Comparator.comparing(Fruit::getPrice))
				.toList(); 		  
		System.out.println("\nQuestion3\n" + redFruits);
		
		
		//Question4
		List<News> newsList = new ArrayList<News>();
		
		newsList.add(new News(1, "Rohit", "Priya", "Surprising"));
		newsList.add(new News(2, "Rohit", "Nakul", "Great news"));
		newsList.add(new News(1, "Priya", "Om", "Looking forward for results now"));
		newsList.add(new News(4, "Nakul", "Priya", "Great news"));
		newsList.add(new News(5, "Priya", "Nakul", "Shocking news!"));
		newsList.add(new News(1, "Nakul", "Priya", "Great news..Thanks Buddy!"));
		newsList.add(new News(4, "Ravi", "Om", "Good news"));
		
		Map<Integer,List<News>> newsGroup = newsList.stream()
		        .collect(Collectors.groupingBy(News::getNewsId));
//		System.out.println(newsGroup);
		
		int maxComments = 0;
		int newsId = 0;
		
		for(Entry<Integer, List<News>> e: newsGroup.entrySet()) {
			if(e.getValue().size() > maxComments) {
				newsId = e.getKey();
				maxComments = e.getValue().size();
			}
		}
		
		System.out.println(newsId + " has max comments of " + maxComments);
		
		
		
		
		
		
		
	}

}
