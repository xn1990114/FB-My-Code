package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.DecodeWaysFollow;

public class DecodeWaysFollowTester {

	@Test
	public void test() {
		DecodeWaysFollow tester=new DecodeWaysFollow();
		System.out.println(tester.countWays("1*2"));
		System.out.println(tester.countWays("1**2"));
	}

}
