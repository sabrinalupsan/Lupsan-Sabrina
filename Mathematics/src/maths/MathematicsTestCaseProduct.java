package maths;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MathematicsTestCaseProduct {
	
	Mathematics m;

	@Test
	void testProduct() {
		m.a = 3;
		m.b = 4;
		int result = m.product(m.a,  m.b);
		assertEquals(result, 12);
	}

}
