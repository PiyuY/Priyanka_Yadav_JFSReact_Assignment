package A5Generics;
import java.util.Date;

public class PairMain {
    public static void main(String[] args) {
        // a
        Pair<String, String> stringPair = new Pair<String, String>(); 
        stringPair.setKey("Priyanka");
        stringPair.setValue("Yadav");
        System.out.println("String Key is: " + stringPair.getKey());
        System.out.println("String Value is: " + stringPair.getValue());

        System.out.println();

        // b
        Pair<String, Date> stringDatePair = new Pair<String, Date>(); 
        stringDatePair.setKey("today");
        stringDatePair.setValue(new Date());
        System.out.println("String Key is: " + stringDatePair.getKey());
        System.out.println("Date Value is: " + stringDatePair.getValue());
        System.out.println(stringDatePair.getKey()+ " " + stringDatePair.getValue());

        
    }
}