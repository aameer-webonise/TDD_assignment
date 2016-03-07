import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class UserNameTest {

	UserName user;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		user=new UserName();
	}

	@After
	public void tearDown() throws Exception {
		user=null;
	}

	@Test
	public void test() {
		assertTrue(user.validateUserName("aameer"));
		assertTrue(user.validateUserName("aameer_ausekar"));
		assertTrue(user.validateUserName("aameer-ausekar"));
	}

	@Test
	public void testFailsForInvalidUserName()
	{
		assertFalse(user.validateUserName("aameer56"));
		assertFalse(user.validateUserName("viru"));
		assertFalse(user.validateUserName("aameer_45"));
		assertFalse(user.validateUserName("aameer56"));
		assertFalse(user.validateUserName("123456"));
		assertFalse(user.validateUserName("aameer&%ausekar"));
	}
}
