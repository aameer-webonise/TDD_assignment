import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ValidatePasswordTest {

	ValidatePassword password;

	@Before
	public void setUp() throws Exception {
		password=new ValidatePassword();
	}

	@After
	public void tearDown() throws Exception {
		password=null;
	}

	@Test
	public void testFailure()
	{
	assertFalse(password.isPasswordValid("aameer54"));
	assertFalse(password.isPasswordValid("aam.eerau"));
	assertFalse(password.isPasswordValid("ausekara"));
		
	}
	@Test
	public void testSuccess()
	{
	assertTrue(password.isPasswordValid("aameer1."));
	assertTrue(password.isPasswordValid("viru-14."));
	assertTrue(password.isPasswordValid("aa.m_eer"));
	}

}
