package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.FindThreeSubArrayOfSizeK;

public class FindThreeSubArrayOfSizeKTester {

	@Test
	public void test() {
		FindThreeSubArrayOfSizeK sorter=new FindThreeSubArrayOfSizeK();
		int[] nums1={1,2,3,4,5,7,8,9};
		int k1=2;
		assertTrue(sorter.findMax(nums1, k1)==36);
		int[] nums2={1,2,3,4,-5,7,8,9};
		assertTrue(sorter.findMax(nums2, k1)==27);
		int[] nums3={10,2,3,4,-5,7,8,9};
		int k2=1;
		assertTrue(sorter.findMax(nums2, k2)==24);
		assertTrue(sorter.findMax(nums3, k2)==27);
		int k3=0;
		assertTrue(sorter.findMax(nums1, k3)==0);
		int[] nums4={-10,-2,3,4,-5,7,8,9};
		assertTrue(sorter.findMax(nums4, k1)==26);
		int[] nums5={-10,-2,3,4,-10,7,-8,9};
		assertTrue(sorter.findMax(nums5, k1)==5);
		int[] nums6={10,-2,10,-4,-10,7,-8,9};
		assertTrue(sorter.findMax(nums6, k1)==15);
		int[] nums7={10,-2,10,-4,-5,-6,7,-9,-8,-9};
		int k4=3;
		assertTrue(sorter.findMax(nums7, k4)==-7);
		int[] nums8={10,-2,10,-4,-6,7,-9,-8,-9};
		assertTrue(sorter.findMax(nums8, k4)==-11);
		int[] nums9={-4,-6,7,10,-2,10,-9,-8,-9};
		assertTrue(sorter.findMax(nums9, k4)==-11);
	}

}
