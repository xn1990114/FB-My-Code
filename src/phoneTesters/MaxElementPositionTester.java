package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.MaxElementPosition;

public class MaxElementPositionTester {

	@Test
	public void test1() {
		MaxElementPosition tester=new MaxElementPosition();
		int[] nums={};
		System.out.println(tester.findMaxPos(nums));
	}
	@Test
	public void test2() {
		MaxElementPosition tester=new MaxElementPosition();
		int[] nums={1,2,3,4,3};
		System.out.println(tester.findMaxPos(nums));
	}
	@Test
	public void test3() {
		MaxElementPosition tester=new MaxElementPosition();
		int[] nums={2,2,2,-1,6,4,5,6};
		System.out.println(tester.findMaxPos(nums));
	}
	@Test
	public void test4() {
		MaxElementPosition tester=new MaxElementPosition();
		int[] nums={-10,-10,-10};
		System.out.println(tester.findMaxPos(nums));
	}
}
