package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.RandomMaxNode;

public class RandomMaxNodeTester {

	@Test
	public void test() {
		int[] array={-100,-200,-10,5,100,5,200,5,200,100,200,-879};
		RandomMaxNode rmn=new RandomMaxNode();
		System.out.println(rmn.findRandomMax(array));
		System.out.println(rmn.findRandomMax(array));
		System.out.println(rmn.findRandomMax(array));
		int[] array2={-10,-10};
		System.out.println(rmn.findRandomMax(array2));
		System.out.println(rmn.findRandomMax(array2));
		int[] array3={};
		assertTrue(rmn.findRandomMax(array3)==-1);
	}

}
