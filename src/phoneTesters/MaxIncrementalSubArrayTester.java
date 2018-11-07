package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.MaxIncrementalSubArray;

public class MaxIncrementalSubArrayTester {

	@Test
	public void test1() {
		MaxIncrementalSubArray tester=new MaxIncrementalSubArray();
		int[] nums={4,5,2,6,10,305,1,2};
		assertTrue(tester.findMaxInscLength(nums, 0)==4);
		assertTrue(tester.findMaxInscLength(nums, 1)==5);
	}
	@Test
	public void test2() {
		MaxIncrementalSubArray tester=new MaxIncrementalSubArray();
		int[] nums={4,5,2,6,10,30,1,2,40,2,1,45,46};
		System.out.println(tester.findMaxInscLength(nums, 4));
		assertTrue(tester.findMaxInscLength(nums, 0)==4);
		assertTrue(tester.findMaxInscLength(nums, 1)==5);
		assertTrue(tester.findMaxInscLength(nums, 2)==5);
		assertTrue(tester.findMaxInscLength(nums, 3)==6);
		assertTrue(tester.findMaxInscLength(nums, 4)==7);
	}
	@Test
	public void test3() {
		MaxIncrementalSubArray tester=new MaxIncrementalSubArray();
		int[] nums={5,3,2,1};
		assertTrue(tester.findMaxInscLength(nums, 0)==1);
		assertTrue(tester.findMaxInscLength(nums, 1)==1);
		assertTrue(tester.findMaxInscLength(nums, 4)==1);
	}
	@Test
	public void test4() {
		MaxIncrementalSubArray tester=new MaxIncrementalSubArray();
		int[] nums={5,3,3,2,3,1};
		assertTrue(tester.findMaxInscLength(nums, 0)==2);
		assertTrue(tester.findMaxInscLength(nums, 1)==3);
	}

}
