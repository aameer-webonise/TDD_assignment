import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SortArrayTest {

	SortArray sort;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sort=new SortArray();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int expecteds[] = {1,2,3,4,5};
		assertArrayEquals(expecteds,sort.sortArray(new int[]{5,4,3,2,1}));
		String stringarray[] = {"five","four","one","three","two"};
		assertArrayEquals(stringarray,sort.sortArray(new String[]{"one","two","three","four","five"}));
	}

}
