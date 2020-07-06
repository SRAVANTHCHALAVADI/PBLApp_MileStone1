import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorsTest {

	@Test
	public void test() {
		Calculators c=new Calculators();
		assertEquals(5,c.add(2, 3));
	}
	@Test
	public void test1() {
		Calculators c=new Calculators();
		assertEquals(6,c.mul(2, 3));
	}
	

}
