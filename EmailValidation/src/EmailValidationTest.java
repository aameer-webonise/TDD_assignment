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
		email=null;
	}

	@Test
	public void testForValidEmailId() {
		assertTrue(email.validate("ausekar9@gmail.com"));
		assertTrue(email.validate("ausekar.9.@gmail.com"));
		assertTrue(email.validate("ausekar.aameer_123.@gmail.com"));
		
	}

	@Test
	public void testFailsForInvalidEmailId()
	{
		assertFalse(email.validate("9@gmail.com"));
		assertFalse(email.validate(".9@gmail.com"));
		assertFalse(email.validate("@gmail.com"));
		assertFalse(email.validate("ausekar.9@.com"));
		assertFalse(email.validate("ausekar9@yahoo."));
		assertFalse(email.validate("ausekar9@yahoo.455"));
		assertFalse(email.validate("ausekar9@yahoocom"));
	}
	
}
