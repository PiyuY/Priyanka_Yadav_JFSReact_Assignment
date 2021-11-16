import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.JUnitQ2_MinMax.MinMaxFinder;

//@RunWith(Suite.class)
//@SuiteClasses({})
public class MinMaxFinderTest {
	@Test
	public void testFinderMinMax() {
		int arr1[] = {12, 2, 87, 56, 41, 23, 24, 987};
		ArrayList<Integer> res1 = MinMaxFinder.findMinMax(arr1);
		ArrayList<Integer> expRes1 = new ArrayList<Integer>();
		expRes1.add(2);
		expRes1.add(987);
		assertEquals(res1, expRes1);
	}
	
	@Test
	public void testFindMinMax2() {
		int arr1[] = {56, 34, 7 ,3, 34, 34, 53};
		ArrayList<Integer> res1 = MinMaxFinder.findMinMax(arr1);
		ArrayList<Integer> expRes1 = new ArrayList<Integer>();
		expRes1.add(3);
		expRes1.add(56);
		assertEquals(res1, expRes1);
	}
	
	
	@Test
	public void testMinMaxFinder3() {
		int arr1[] = {2, 78, 0 ,45, -24, 530, -2};
		ArrayList<Integer> res1 = MinMaxFinder.findMinMax(arr1);
		ArrayList<Integer> expRes1 = new ArrayList<Integer>();
		expRes1.add(-24);
		expRes1.add(530);
		assertEquals(res1, expRes1);
	}
}
