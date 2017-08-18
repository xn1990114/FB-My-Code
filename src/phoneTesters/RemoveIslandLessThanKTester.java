package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.RemoveIslandLessThanK;

public class RemoveIslandLessThanKTester {

	@Test
	public void test() {
		int[][] island={{1,1,1,1,0,0,0,0},
						{1,1,0,1,0,1,1,0},
						{1,1,1,1,1,0,0,0},
						{0,0,0,0,0,1,1,0},
						{1,1,1,1,1,0,1,1},
						{0,0,0,0,1,1,1,0},
						{1,0,0,0,0,0,0,0},
						{1,1,0,0,1,1,0,0},
						{1,1,1,0,1,1,0,1}};
		RemoveIslandLessThanK ri=new RemoveIslandLessThanK();
		ri.removeIsLand(island, 12);
	}

}
