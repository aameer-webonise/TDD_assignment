import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class EmailValidationTest {

	EmailValidation email;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		email=new EmailValidation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(email.validate("ausekar9@gmail.com"));
		assertFalse(email.validate("@gmail.com"));
		assertTrue(email.validate("ausekar.9.@gmail.com"));
		//assertTrue(email.validate(".9@gmail.com"));
		//assertTrue(email.validate("9@gmail.com"));
	}

}
