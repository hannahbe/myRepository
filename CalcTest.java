import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {
	
	@Test
	public void testEmptyString() {
	int result = new Calc().add("");
	assertEquals(0,result);
	}
	
	@Test
	public void testOneNumber() {
		int result = new Calc().add("2");
		assertEquals(2,result);
	}
	
	@Test
	public void testTwoNumbers() {
		int result = new Calc().add("2,3");
		assertEquals(5,result);
	}
	
	@Test
	public void testUnknownAmountOfNumbers() {
		int result = new Calc().add("2,3,5");
		assertEquals(10,result);
	}
	
	@Test
	public void testNewLinesBetweenNumbers() {
		int result = new Calc().add("2\n3,5");
		assertEquals(10,result);
	}
}
