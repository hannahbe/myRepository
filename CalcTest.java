import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class CalcTest {
	
	@Test
	public void testEmptyString() throws Exception {
	int result = new Calc().add("");
	assertEquals(0,result);
	}
	
	@Test
	public void testOneNumber() throws Exception {
		int result = new Calc().add("2");
		assertEquals(2,result);
	}
	
	@Test
	public void testTwoNumbers() throws Exception {
		int result = new Calc().add("2,3");
		assertEquals(5,result);
	}
	
	@Test
	public void testUnknownAmountOfNumbers() throws Exception {
		int result = new Calc().add("2,3,5");
		assertEquals(10,result);
	}
	
	@Test
	public void testNewLinesBetweenNumbers() throws Exception {
		int result = new Calc().add("2\n3,5");
		assertEquals(10,result);
	}
	
	@Test
	public void testSupportDifferentDelimiters() throws Exception {
		int result = new Calc().add("//;\n2;3");
		assertEquals(5,result);
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testThrowException() throws Exception {
		exception.expect(Exception.class);
		exception.expectMessage("negatives not allowed -2,-3");
		new Calc().add("-2\n-3,5");
	}
}
