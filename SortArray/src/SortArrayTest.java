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
		sort=null;
	}

	@Test
	public void test() {
		int sortedArray[] = {10,20,30,40,50};
		assertArrayEquals(sortedArray,sort.sortArray(new int[]{50,40,30,20,10}));
		
		String sortedStringarray[] = {"five","four","one","three","two"};
		assertArrayEquals(sortedStringarray,sort.sortArray(new String[]{"one","two","three","four","five"}));
	
		double sortedDoubleArray[]={6.3,8.0,9.5,10.3};
		assertArrayEquals(sortedDoubleArray, sort.sortArray(new double[]{10.3,8.0,6.3,9.5}),0);
		
	}

}
