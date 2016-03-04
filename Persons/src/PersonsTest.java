import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PersonsTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("1Aameer21Male", new Persons(1,"Aameer",21,"Male").toString());
		assertEquals("2Viresh25Male", new Persons(2,"Viresh",25,"Male").toString());
	}

}
