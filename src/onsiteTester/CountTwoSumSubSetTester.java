package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.CountTwoSumSubSet;

public class CountTwoSumSubSetTester {

	@Test
	public void test() {
		int[] array={8,12,76,423,432,501};
		CountTwoSumSubSet ctsss=new CountTwoSumSubSet();
		assertTrue(ctsss.count(500, array)==31);
		assertTrue(ctsss.count(10000, array)==63);
		assertTrue(ctsss.count(0, array)==0);
	}

}
