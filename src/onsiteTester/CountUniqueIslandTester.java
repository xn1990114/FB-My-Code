package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.CountUniqueIsland;

public class CountUniqueIslandTester {

	@Test
	public void test() {
		int[][] i1={{1,1,0,0,0,0},
					{1,1,0,0,0,1},
					{0,0,1,1,0,1},
					{1,0,1,1,0,0},
					{1,0,0,0,0,0}};
		CountUniqueIsland c=new CountUniqueIsland();
		assertTrue(c.countUnique(i1)==2);
		int[][] i2={{1,1,1,1,0,0},
					{1,0,1,1,0,1},
					{1,1,0,1,0,1},
					{1,1,1,1,0,0},
					{0,0,0,0,0,0},
					{1,0,1,1,1,1},
					{1,0,1,0,1,1},
					{1,0,1,1,0,1},
					{1,0,1,1,1,1}};
		assertTrue(c.countUnique(i2)==3);
	}

}
