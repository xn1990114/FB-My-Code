package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.AscendingInOneSwap;

public class AscendingInOneSwapTester {

	@Test
	public void test() {
		AscendingInOneSwap tester=new AscendingInOneSwap();
		int[] nums1={4,2,3,1,5,6};
		assertTrue(tester.canSwapToAscend(nums1));
		int[] nums2={4,2,3,5,1,6};
		assertTrue(!tester.canSwapToAscend(nums2));
		int[] nums3={2,1,3,4};
		assertTrue(tester.canSwapToAscend(nums3));
	}

}
