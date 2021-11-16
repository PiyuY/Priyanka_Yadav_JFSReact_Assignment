import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.example.JUnitQ1_MinMax.MinMaxFinder;

//@RunWith(Suite.class)
//@SuiteClasses({})
public class MinMaxFinderTest {
	@Test
	public void testFinderMinMax() {
		int arr1[] = {12, 2, 87, 56, 41, 23, 24, 987};
		int res1[] = MinMaxFinder.findMinMax(arr1);
		int expRes1[] = {2, 987};
		assertArrayEquals(res1, expRes1);
	}
	
	@Test
	public void testFindMinMax2() {
		int arr1[] = {56, 34, 7 ,3, 34, 34, 53};
		int res1[] = MinMaxFinder.findMinMax(arr1);
		int expRes1[] = {3, 56};
		assertArrayEquals(res1, expRes1);
	}
	
	
	@Test
	public void testMinMaxFinder3() {
		int arr1[] = {2, 78, 0 ,45, -24, 530, -2};
		int res1[] = MinMaxFinder.findMinMax(arr1);
		int expRes1[] = {-24, 530};
		assertArrayEquals(res1, expRes1);
	}
}
