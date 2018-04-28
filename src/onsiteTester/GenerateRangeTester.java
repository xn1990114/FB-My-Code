package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.GenerateRange;

public class GenerateRangeTester {

	@Test
	public void test1() {
		GenerateRange tester=new GenerateRange();
		int[] nums={1,2,4,5,6,8,9,13};
		int[][] res={{1,2}, {4,6}, {8,9}, {13,13}};
		assertTrue(tester.checkRes(tester.makeRanges(nums), res));
	}
	@Test
	public void test2() {
		GenerateRange tester=new GenerateRange();
		int[] nums={};
		int[][] res={};
		assertTrue(tester.checkRes(tester.makeRanges(nums), res));
	}
	@Test
	public void test3() {
		GenerateRange tester=new GenerateRange();
		int[] nums={1,1,1,1,2,2,2,4,5,5,5,6,6,6,7,8,9,13};
		int[][] res={{1,2}, {4,9},{13,13}};
		assertTrue(tester.checkRes(tester.makeRanges(nums), res));
	}

}
