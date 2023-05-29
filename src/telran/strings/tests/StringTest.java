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
	@Test 
	void CompateToTest() {
		String str="JAVA";
		assertEquals(0,str.compareTo("JAVA"));
		assertEquals(2,str.compareTo("JA"));
		assertEquals(-1,str.compareTo("JAVAV"));
		assertEquals(1,str.compareTo("JAV"));
	


	}
	@Test 
	void CompateToIgnoreTest() {
		String str="JAVA";
		assertEquals(0,str.compareToIgnoreCase("java"));
		assertEquals(2,str.compareToIgnoreCase("ja"));
		assertEquals(0,str.compareToIgnoreCase("JAVA"));
		assertEquals(1,str.compareToIgnoreCase("jav"));
	


	}
	@Test 
	void ConcatTest() {
		String str="JAVA";
		assertEquals("JAVASCRIPT",str.concat("SCRIPT"));
		assertEquals("JAVACode",str.concat("Code"));
		assertEquals("JAVAJAV",str.concat("JAV"));
		assertEquals("JAVA123",str.concat("123"));
	


	}
	@Test 
	void StartsWithTest() {
		String str="JAVA";
		assertTrue(str.startsWith("J"));
		assertTrue(str.startsWith("JA"));
		assertTrue(str.startsWith("JAV"));
		assertFalse(str.startsWith("A"));
		assertFalse(str.startsWith("VA"));
	}
	@Test 
	void EndsWithTest() {
		String str="JAVA";
		assertFalse(str.endsWith("AS"));
		assertFalse(str.endsWith("JA"));
		assertTrue(str.endsWith("VA"));
		assertTrue(str.endsWith("A"));
		assertTrue(str.endsWith("AVA"));
	}
	@Test 
	void EqualsIgnoreTest() {
		String str="JAVA";
		assertFalse(str.equalsIgnoreCase("JABA"));
		assertFalse(str.equalsIgnoreCase("jaba"));
		assertTrue(str.equalsIgnoreCase("java"));
		assertTrue(str.equalsIgnoreCase("JAVA"));
		assertFalse(str.equalsIgnoreCase("ava"));
	}
	@Test 
	void IndexOfTest() {
		String str="JAVA";
		assertEquals(0,str.indexOf("J"));
		assertEquals(1,str.indexOf("A"));
		assertEquals(2,str.indexOf("V"));
		assertEquals(-1,str.indexOf("C"));
	


	}
	@Test 
	void LastIndexOFTest() {
		String str="JAVA it's a programming language";
		assertEquals(3,str.lastIndexOf("A"));
		assertEquals(12,str.lastIndexOf("programming"));
		assertEquals(-1,str.lastIndexOf("C"));
		assertEquals(0,str.lastIndexOf("J"));
		assertEquals(30,str.lastIndexOf("ge"));


		
	


	}
	
	




	
	

}
