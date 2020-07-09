import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortTheValuesTest {

	SortTheValues s;
	 int a[];
	 int b[];
	@Before
	public void bef() {
		s=new SortTheValues();
		a = new int[] {2,6,3,5,1};
		b = new int[] {1,2,3,5,6};
	}
	@Test
	public void test() {
		assertArrayEquals(b,s.sortval(b));
		
	}

}
