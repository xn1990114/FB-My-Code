package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.MinRunTimeScheduler;

public class MinRunTimeSchedulerTester {

	@Test
	public void test() {
		MinRunTimeScheduler s=new MinRunTimeScheduler();
		String t1="aaba";
		int k1=2;
		assertTrue(s.calSchedule(t1, k1).equals("a__ab_a"));
		assertTrue(s.calScheduleWithConstantSpace(t1, k1).equals("a__ab_a"));
		String t2="abcabc";
		int k2=3;
		assertTrue(s.calSchedule(t2, k2).equals("abc_abc"));
		assertTrue(s.calScheduleWithConstantSpace(t2, k2).equals("abc_abc"));
		String t3="abcdefbdfabd";
		int k3=6;
		assertTrue(s.calSchedule(t3, k3).equals("abcdef__b_d_fa_b_d"));
		assertTrue(s.calScheduleWithConstantSpace(t3, k3).equals("abcdef__b_d_fa_b_d"));
	}

}