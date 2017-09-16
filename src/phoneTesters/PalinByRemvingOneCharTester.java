package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.PalinByRemvingOneChar;

public class PalinByRemvingOneCharTester {

	@Test
	public void test() {
		PalinByRemvingOneChar tester=new PalinByRemvingOneChar();
		assertTrue(tester.isPalinByRemoveOne("abca"));
		assertTrue(tester.isPalinByRemoveOne("adbda"));
		assertTrue(tester.isPalinByRemoveOne("adabda"));
		assertTrue(!tester.isPalinByRemoveOne("adabdda"));
		assertTrue(tester.isPalinByRemoveOne("dbabda"));
	}

}
