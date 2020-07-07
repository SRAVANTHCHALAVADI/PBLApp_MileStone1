import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {

	@Test
	public void test() {
		Employe e=new Employe("h1",2,3333);
		assertEquals("Sravanth",e.highSal());
	}

}
