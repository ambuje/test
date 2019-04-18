package lab8;
import org.junit.jupiter.api.Test;

class testaddstring {

	@Test
	void test() {
		junit jn = new junit();
		String result = jn.addStrings("heelo","moto");
		assertEquals("heelomoto",result);		
	}

}
