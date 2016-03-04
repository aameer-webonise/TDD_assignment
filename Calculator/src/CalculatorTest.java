import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {
	Calculator operation;
	@Before
	public void setUp() throws Exception {
		operation=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIntegerAddition() {
		assertEquals(10, operation.add(5, 5));
		assertEquals(6, operation.add(2, 4));
		assertEquals(15, operation.add(8, 7));
		assertEquals(2, operation.add(1, 1));
		assertEquals(0, operation.add(0, 0));
		assertEquals(-6, operation.add(-2, -4));

		assertEquals(2, operation.sub(-2, -4));
		
	}
	
	@Test
	public void testDoubleAddition()
	{
		assertEquals(10.0, operation.add(4.0, 6.0),0);
		assertEquals(6.5, operation.add(4.4, 2.1),0);
		assertEquals(11.1, operation.add(5.5, 5.6),0);
	}
	
	@Test
	public void testDoubleSubstraction()
	{
		assertEquals(1.0,operation.sub(11.0, 10.0),0);
		assertEquals(-1.0,operation.sub(12.0, 13.0),0);
		assertEquals(-0.9,operation.sub(5.1, 6.0),1);
		assertEquals(1.5,operation.sub(11.5, 10.0),0);
		assertEquals(-0.1,operation.sub(0.9, 1.0),1);
	}
	
	@Test
	public void testIntegerSubstraction()
	{
		assertEquals(2, operation.sub(-2, -4));
		assertEquals(-6, operation.sub(-2, 4));
		assertEquals(11, operation.sub(7, -4));
		assertEquals(-2, operation.sub(2, 4));
		assertEquals(1, operation.sub(-7, -8));
	}

	@Test
	public void testDoubleMultiplication()
	{
		assertEquals(15.0, operation.mul(5.0, 3.0),0);
		assertEquals(8.32, operation.mul(2.6, 3.2),0);
		assertEquals(1.86, operation.mul(0.6, 3.1),1);
		assertEquals(-1.86, operation.mul(-0.6, 3.1),1);
	}
	
	@Test
	public void testIntegerMultiplication()
	{
		assertEquals(-2, operation.mul(-2, 1));
		assertEquals(32, operation.mul(-8, -4));
		assertEquals(28, operation.mul(7, 4));
		assertEquals(8, operation.mul(2, 4));
		assertEquals(56, operation.mul(-7, -8));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIntegerDivide()
	{
		assertEquals(2, operation.div(4, 0));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testDoubleDivide()
	{
		assertEquals(2, operation.div(4.5, 0),0);
	}
}
