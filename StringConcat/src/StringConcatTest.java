import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StringConcatTest {

	StringConcat concatObject;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		concatObject=new StringConcat();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("aameerausekar", concatObject.ArrayToString(new String[]{"aameer","ausekar"}));
		assertEquals("hello ",concatObject.ArrayToString(new String[]{"hello"," "}));
		assertEquals("helloworld",concatObject.ArrayToString(new String[]{"hello","","world"}));
		assertEquals("webonise//[lab",concatObject.ArrayToString(new String[]{"webonise//","[lab"}));
	}

}
