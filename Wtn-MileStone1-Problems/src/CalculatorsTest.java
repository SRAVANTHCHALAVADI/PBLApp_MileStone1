import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorsTest {
	Calculators c;
	@Before
	public void sam() {
		c=new Calculators();
	}
	

	@Test
	public void test() {
		assertEquals(5,c.add(2, 3));
	}
	@Test
	public void test1() {
		assertEquals(6,c.mul(2, 3));
	}
	

}
