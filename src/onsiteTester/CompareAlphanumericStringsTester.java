package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.CompareAlphanumericStrings;

public class CompareAlphanumericStringsTester {

	@Test
	public void test() {
		CompareAlphanumericStrings tester=new CompareAlphanumericStrings();
		assertTrue(tester.compareStrings("abc12", "abc9")==1);
		assertTrue(tester.compareStrings("abcd12", "abcdd9")==-1);
		assertTrue(tester.compareStrings("ab12a", "ab12")==1);
		assertTrue(tester.compareStrings("ab12a", "ab12cd")==-1);
		assertTrue(tester.compareStrings("ab123a", "ab122cd")==1);
		assertTrue(tester.compareStrings("123a", "ab122cd")==1);
		assertTrue(tester.compareStrings("123a", "123a")==0);
		
	}

}
