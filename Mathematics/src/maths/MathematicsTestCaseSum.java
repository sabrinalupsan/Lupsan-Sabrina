package maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathematicsTestCaseSum {
	
	Mathematics m;

	@Test
	void testSum() {
		m.a = 3;
		m.b = 4;
		int result = m.sum(m.a,  m.b);
		assertEquals(result, 7);
	}
	
	@Test
	void testProduct() {
		m.a = 3;
		m.b = 4;
		int result = m.product(m.a,  m.b);
		assertEquals(result, 12);
	}

}
