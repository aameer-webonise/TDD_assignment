import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ValidateIFSCTest {

	ValidateIFSC code;

	@Before
	public void setUp() throws Exception {
		code=new ValidateIFSC();
	}

	@After
	public void tearDown() throws Exception {
		code=null;
	}

	@Test
	public void testCaseFailure()
	{
	assertFalse(code.isIFSCCodeValid("0123456HSBC"));
	assertFalse(code.isIFSCCodeValid("ICICI0123456"));
	assertFalse(code.isIFSCCodeValid("HBCD1023456"));
	}
	@Test
	public void testCaseSuccess()
	{
	assertTrue(code.isIFSCCodeValid("SBII0123456"));
	assertTrue(code.isIFSCCodeValid("HDFC0345346"));
	assertTrue(code.isIFSCCodeValid("dgdg0457547"));
	}

}
