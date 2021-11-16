package A5Generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Q2Main {
    public static void main(String args[]) {
        
        // every generic class in java store only objects and not any data type directly. i.e. ex. Integer instead of int
        Map<Integer, Double> myMap = new HashMap<Integer, Double>();
        
        // int b = (int)(Math.random()*(max-min+1)+min);  for random number

        //myMap.put(new Integer(1), new Double(1.25));
        myMap.put(Integer.valueOf(1), Double.valueOf(1.25));
        myMap.put(Integer.valueOf(2), Double.valueOf(2.25));
        myMap.put(Integer.valueOf(3), Double.valueOf(3.25));
        myMap.put(Integer.valueOf(4), Double.valueOf(4.25));
        myMap.put(Integer.valueOf(5), Double.valueOf(5.25));
        myMap.put(Integer.valueOf(6), Double.valueOf(6.25));
        myMap.put(Integer.valueOf(7), Double.valueOf(7.25));
        myMap.put(Integer.valueOf(8), Double.valueOf(8.25));
        myMap.put(Integer.valueOf(9), Double.valueOf(9.25));
        myMap.put(10, 10.25);


        // iterate keys.
        Iterator<Integer> itr = myMap.keySet().iterator();
        while(itr.hasNext()) {
            Integer key = itr.next();
            // to get value using key in map
            Double value = myMap.get(key);
            
            System.out.println("Integer Key:" + key + "     Value: " + value);
        }
   
    
    }
}
