import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeJunitTest {
	PrimeJunit p;
	@Before
	public void dem() {
		p=new PrimeJunit();
	}
	@Test
	public void test() {
		assertEquals("prime",p.isprime(3));
	}
	@Test
	public void test1() {
		assertEquals("prime",p.isprime(7));
	}

}
