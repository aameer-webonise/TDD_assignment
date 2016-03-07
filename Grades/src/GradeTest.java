import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GradeTest {

	Grades grade;

	@Before
	public void setUp() throws Exception {
		grade=new Grades();
	}

	@After
	public void tearDown() throws Exception {
		grade=null;
	}

	@Test
	public void test() {
		assertSame("A", grade.getGrade(70));
		assertSame("B", grade.getGrade(60));
		assertSame("C", grade.getGrade(50));
		assertSame("D", grade.getGrade(40));
		assertSame("F", grade.getGrade(30));
		
		assertSame("A", grade.getGrade(75));
		assertSame("B", grade.getGrade(63));
		assertSame("F", grade.getGrade(39));
		assertSame("F", grade.getGrade(-54));
	}

}
