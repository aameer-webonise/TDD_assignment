import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PersonsTest {
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("1Aameer21Male", new Persons(1,"Aameer",21,"Male").toString());
		assertEquals("2Viresh25Male", new Persons(2,"Viresh",25,"Male").toString());
		assertEquals("3 25Female", new Persons(3," ",25,"Female").toString());
		assertEquals("4,arjun20}{Male", new Persons(4,",arjun",20,"}{Male").toString());
	}

}
