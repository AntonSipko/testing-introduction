package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void charAtTest() {
		String str="Hello";
		assertEquals('H',str.charAt(0));
		assertEquals('e',str.charAt(1));
		assertEquals('l',str.charAt(2));
		assertEquals('l',str.charAt(3));
		assertEquals('o',str.charAt(4));


		
	}
	@Test 
	void containsTest() {
		String str="Hello";
		assertTrue(str.contains("H"));
		assertFalse(str.contains("h"));
		assertTrue(str.contains("ello"));
		assertFalse(str.contains("lelo"));


		
	}

}
