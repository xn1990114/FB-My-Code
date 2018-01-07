package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.CountTwoSumSubSet;

public class CountTwoSumSubSetTester {

	@Test
	public void test() {
		int[] array={8,12,76,423,432,501};
		CountTwoSumSubSet ctsss=new CountTwoSumSubSet();
		assertTrue(ctsss.count(500, array)==26);
		assertTrue(ctsss.count(10000, array)==63);
		assertTrue(ctsss.count(0, array)==0);
		int[] array2={8,12,76,423,432,501};
		assertTrue(ctsss.count(436, array2)==13);
		assertTrue(ctsss.count(435, array2)==11);
	}

}
