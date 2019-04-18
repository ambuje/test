package lab8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumber {

	@Test
	void test() {
		junit jn = new junit();
		int result = jn.addNumbers(434,100);
		assertEquals(534,result);
		
		
	}
}
