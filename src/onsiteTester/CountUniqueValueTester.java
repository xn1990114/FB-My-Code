package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.CountUniqueValue;

public class CountUniqueValueTester {

	@Test
	public void test() {
		CountUniqueValue counter=new CountUniqueValue();
		int[] nums0={};
		assertTrue(counter.countUnique(nums0).equals(""));
		int[] nums1={-10,-1,0,4,5,5,6,7,8,8,19};
		assertTrue(counter.countUnique(nums1).equals("-10-1,-1-1,0-1,4-1,5-2,6-1,7-1,8-2,19-1"));
		int[] nums2={1,1,1,1,1,1,1,1,1,1};
		assertTrue(counter.countUnique(nums2).equals("1-10"));
		int[] nums3={1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,3,3,3};
		assertTrue(counter.countUnique(nums3).equals("1-10,2-10,3-3"));
	}

}
