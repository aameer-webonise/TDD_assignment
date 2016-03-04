import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ValidatePasswordTest {

	ValidatePassword password;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		password=new ValidatePassword();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFailure()
	{
	assertFalse(password.isPasswordValid("aameer454"));
	assertFalse(password.isPasswordValid("a4aw."));
	assertFalse(password.isPasswordValid("..,/,~`"));
	}
	@Test
	public void testSuccess()
	{
	assertTrue(password.isPasswordValid("aameer123456."));
	assertTrue(password.isPasswordValid("12345678."));
	assertTrue(password.isPasswordValid("viru5432q,||`~.,"));
	}

}
