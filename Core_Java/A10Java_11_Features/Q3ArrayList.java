package A10Java_11_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3ArrayList {

	public static void main(String[] args) {

		String str = "A quick brown fox jumps over the lazy dog";
		List<String> strList = new ArrayList<String>(Arrays.asList(str.split(" ")));

		Object[] newstr = strList.toArray();
		for (Object word : newstr) {
			System.out.println(word);
		}

	}

}
